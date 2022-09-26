//package org.etri.slice.api;
//
//import org.opencord.olt.AccessDevicePort;
//import org.etri.sis.UniTagInformation;
//
//import java.util.Objects;
//
//public class ServiceKey {
//    private AccessDevicePort port;
//    private UniTagInformation service;
//
//
//    public ServiceKey(AccessDevicePort port, UniTagInformation service) {
//        this.port = port;
//        this.service = service;
//    }
//
//    public AccessDevicePort getPort() {
//        return port;
//    }
//
//    public void setPort(AccessDevicePort port) {
//        this.port = port;
//    }
//
//    public UniTagInformation getService() {
//        return service;
//    }
//
//    public void setService(UniTagInformation service) {
//        this.service = service;
//    }
//
//    @Override
//    public String toString() {
//        return this.port.toString() + " - " + this.service.getServiceName();
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        ServiceKey that = (ServiceKey) o;
//        boolean isPortEqual = Objects.equals(port, that.port);
//        boolean isServiceEqual = Objects.equals(service, that.service);
//
//        return isPortEqual && isServiceEqual;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(port, service);
//    }
//}
