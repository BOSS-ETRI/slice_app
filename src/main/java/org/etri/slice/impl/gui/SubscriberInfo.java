package org.etri.slice.impl.gui;

//    { field: 'id', headerName: 'Subscriber ID', flex: 2},
//            { field: 'sliceName', headerName: 'Slice Name', flex: 2},
//            { field: 'dbaType', headerName: 'DBA Type', flex: 1},
//            { field: 'uniPort', headerName: 'UNI Port', type: 'number', flex: 1},
//            { field: 'ponCTag', headerName: 'PON C-Tag', flex: 1.5},
//            { field: 'ponSTag', headerName: 'PON S-Tag', flex: 1.5},
//            { field: 'cir', headerName: 'CIR', flex: 1},
//            { field: 'cbs', headerName: 'CBS', flex: 1},
//            { field: 'pir', headerName: 'PIR', flex: 1},
//            { field: 'pbs', headerName: 'PBS', flex: 1},
//            { field: 'oltId', headerName: 'OLT', flex: 1, hide: true},
//            { field: 'oltPort', headerName: 'OLT Port', type: 'number', flex: 1, hide: true},
//            { field: 'onuId', headerName: 'ONU', flex: 1, hide: true},
//            { field: 'onuPort', headerName: 'ONU Port', type: 'number', flex: 1, hide: true},

public class SubscriberInfo {
    public String SubscriberId;
    public String SliceName;
    public String DBAType;
    public String OLTId;
    public String PonPort;
    public String ONUId;
    public String UniPort;
    public String PonCTag;
    public String PonSTag;
    public long CIR;
    public long CBS;
    public long PIR;
    public long PBS;

    public SubscriberInfo() {}
}
