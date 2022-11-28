package org.etri.slice.impl;

import io.netty.util.internal.ConcurrentSet;
import org.onosproject.net.DeviceId;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import static org.etri.slice.impl.C.BW_UPDATE_OP.ADD;
import static org.etri.slice.impl.C.MINIMUM_BANDWIDTH;
import static org.etri.slice.impl.C.RESULTS.*;

public class SliceInstance extends BandwidthModifier{

    private String sliceName;
    private int sliceId;
    private C.DBA_ALG dbaAlg;

    private OLTDevice deviceId;
    private PonPort ponPort;
    private String uniPort;
    private List<String> subscriberIds;
    private ConcurrentMap<String, Integer> bandwidthBySubscribers;

    public SliceInstance(String sliceName, String uniPort,
                         int allocBandwidth, C.DBA_ALG dbaAlg) {
        this.sliceName = sliceName;
        this.allocBandwidth = allocBandwidth;
        this.remainedBandwidth = allocBandwidth;
        this.dbaAlg = dbaAlg;
        this.uniPort = uniPort;

        subscriberIds = new LinkedList<>();
        bandwidthBySubscribers = new ConcurrentHashMap<>();
    }

    public C.RESULTS addSubscriber(String subscriberId, int reqBandwidth) {
        if(reqBandwidth <= MINIMUM_BANDWIDTH) return WRONG_INPUT;
        if(isSubscriberPresent(subscriberId)) return SUBSCRIBER_EXIST;
        if(remainedBandwidth < reqBandwidth) return INSUFFICIENT_BANDWIDTH;

        subscriberIds.add(subscriberId);
        bandwidthBySubscribers.putIfAbsent(subscriberId, reqBandwidth);
        updateRemainedBandwidth(ADD, reqBandwidth);
        updateRemainedBandwidth(ADD, reqBandwidth);

        return SUCCESS;
    }


    public C.RESULTS modifyCapacity(C.BW_UPDATE_OP flag, int reqBandwidth) {
        if(reqBandwidth <= MINIMUM_BANDWIDTH) return WRONG_INPUT;
        switch (flag) {
            case ADD:
                allocBandwidth += reqBandwidth;
                break;
            case DROP:
                if(allocBandwidth - reqBandwidth < remainedBandwidth) return OVERFLOW_BANDWIDTH;
                break;
        }

        return C.RESULTS.SUCCESS;
    }

    public C.RESULTS removeSubscriber(String subscriberId) {
        if(!isSubscriberPresent(subscriberId)) return SUBSCRIBER_NOT_EXIST;

        int subBandwidth =  bandwidthBySubscribers.get(subscriberId);
        remainedBandwidth += subBandwidth;
        bandwidthBySubscribers.remove(subscriberId);
        subscriberIds.remove(subscriberId);

        return SUCCESS;
    }

    public boolean isSubscriberPresent(String subscriberId) {
        if(subscriberIds.contains(subscriberId))
            return true;
        return false;
    }

    public String getSliceName() {
        return sliceName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SliceInstance{");
        sb.append("sliceName=").append(sliceName);
        sb.append(", dbaAlg=").append(dbaAlg);
        sb.append(", uniPort=").append(uniPort);
        sb.append(", subscriberIds=").append(subscriberIds);
        sb.append(", bandwidthBySubscribers=").append(bandwidthBySubscribers);
        sb.append('}');
        return sb.toString();
    }
}
