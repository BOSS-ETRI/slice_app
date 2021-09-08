package org.etri.slice.api;

import org.onosproject.event.AbstractEvent;
import org.onosproject.net.DeviceId;

public class SliceCtrlEvent extends AbstractEvent<SliceCtrlEvent.Type, DeviceId> {
	protected SliceCtrlEvent(Type type, DeviceId subject) {
		super(type, subject);
	}
	public enum Type {
        /**
         * A subscriber was registered and provisioned.
         */
        SUBSCRIBER_REGISTERED,

        /**
         * A subscriber was unregistered and deprovisioned.
         */
        SUBSCRIBER_UNREGISTERED,

        /**
         * An access device connected.
         */
        DEVICE_CONNECTED,

        /**
         * An access device disconnected.
         */
        DEVICE_DISCONNECTED,

        /**
         * A new UNI port has been detected.
         */
        UNI_ADDED,

        /**
         * An existing UNI port was removed.
         */
        UNI_REMOVED,

        /**
         * A uniTag (one service) was registered and provisioned.
         */
        SUBSCRIBER_UNI_TAG_REGISTERED,

        /**
         * A uniTag (one service) was unregistered and deprovisioned.
         */
        SUBSCRIBER_UNI_TAG_UNREGISTERED,

        /**
         * A uniTag (one service) was failed while registration.
         */
        SUBSCRIBER_UNI_TAG_REGISTRATION_FAILED,

        /**
         * A uniTag (one service) was failed while unregistration.
         */
        SUBSCRIBER_UNI_TAG_UNREGISTRATION_FAILED
    }
}
