package org.etri.slice.impl;

import io.netty.util.internal.ConcurrentSet;
import org.onosproject.net.DeviceId;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SliceInstance extends BandwidthModifier{

    private String sliceName;

    private C.DBA_ALG dbaAlg;

    private List<DeviceId> deviceIds;
    private List<String> ponPortNames;
    private List<Integer> allocIds;
    private List<Integer> tpIds;
    private List<String> subscriberIds;
    private ConcurrentMap<String, Integer> bandwidthBySubscribers;

    public SliceInstance(String sliceName, int allocBandwidth, C.DBA_ALG dbaAlg) {
        this.sliceName = sliceName;
        this.allocBandwidth = allocBandwidth;
        this.remainedBandwidth = allocBandwidth;
        this.dbaAlg = dbaAlg;

        deviceIds = new LinkedList<>();
        ponPortNames = new LinkedList<>();
        allocIds = new LinkedList<>();
        subscriberIds = new LinkedList<>();
        bandwidthBySubscribers = new ConcurrentHashMap<>();
    }

    public C.RESULTS addSubscriber(String subscriberId, int reqBandwidth) {
        if(reqBandwidth <= C.MINIMUM_BANDWIDTH) return C.RESULTS.WRONG_INPUT;
        if(isSubscriberPresent(subscriberId)) return C.RESULTS.SUBSCRIBER_EXIST;
        if(remainedBandwidth < reqBandwidth) return C.RESULTS.INSUFFICIENT_BANDWIDTH;

        subscriberIds.add(subscriberId);
        bandwidthBySubscribers.putIfAbsent(subscriberId, reqBandwidth);
        updateRemainedBandwidth(C.BW_UPDATE_OP.ADD, reqBandwidth);

        return C.RESULTS.SUCCESS;
    }


    public C.RESULTS modifyCapacity(C.BW_UPDATE_OP flag, int reqBandwidth) {
        if(reqBandwidth <= C.MINIMUM_BANDWIDTH) return C.RESULTS.WRONG_INPUT;
        switch (flag) {
            case ADD:
                allocBandwidth += reqBandwidth;
                break;
            case DROP:
                if(allocBandwidth - reqBandwidth < remainedBandwidth) return C.RESULTS.OVERFLOW_BANDWIDTH;
                break;
        }

        return C.RESULTS.SUCCESS;
    }

    public C.RESULTS deleteSubscriber(String subscriberId) {
        if(!isSubscriberPresent(subscriberId)) return C.RESULTS.SUBSCRIBER_NOT_EXIST;

        int subBandwidth =  bandwidthBySubscribers.get(subscriberId);
        remainedBandwidth += subBandwidth;
        bandwidthBySubscribers.remove(subscriberId);
        subscriberIds.remove(subscriberId);

        return C.RESULTS.SUCCESS;
    }

    public boolean isSubscriberPresent(String subscriberId) {
        if(subscriberIds.contains(subscriberId))
            return true;
        return false;
    }
}
