package collections;

import java.util.HashSet;
import java.util.Set;

public enum BusinessTripStatus {

    CREATED("CREATED"),  //old status
    UPDATED("UPDATED"),  //old status
    DELETED("DELETED"),  //old status
    CANCELED("CANCELED"),
    DRAFT("DRAFT"),
    TO_BE_APPROVED_BY_LEADER("TO BE APPROVED BY LEADER"),
    REJECTED_BY_LEADER("REJECTED BY LEADER"),
    APPROVED("APPROVED"),
    RESERVATION_TO_BE_DONE("RESERVATION TO BE DONE"),
    RESERVATION_DONE("RESERVATION DONE"),
    FINISHED("FINISHED"),
    DOCS_TO_BE_VERIFIED("DOCS TO BE VERIFIED"),
    DOCS_TO_UPDATE("DOCS TO UPDATE"),
    TO_BE_FINALLY_APPROVED_BY_LEADER("TO BE FINALLY APPROVED BY LEADER"),
    SETTLED("SETTLED");

    public final String name;
    private static final Set<BusinessTripStatus> STATUSES_BUSINESS_TRIP_EDITABLE = new HashSet<>();

    static {
        STATUSES_BUSINESS_TRIP_EDITABLE.add(BusinessTripStatus.DRAFT);
        STATUSES_BUSINESS_TRIP_EDITABLE.add(BusinessTripStatus.TO_BE_APPROVED_BY_LEADER);
        STATUSES_BUSINESS_TRIP_EDITABLE.add(BusinessTripStatus.REJECTED_BY_LEADER);
        STATUSES_BUSINESS_TRIP_EDITABLE.add(BusinessTripStatus.APPROVED);
        STATUSES_BUSINESS_TRIP_EDITABLE.add(BusinessTripStatus.RESERVATION_TO_BE_DONE);
        STATUSES_BUSINESS_TRIP_EDITABLE.add(BusinessTripStatus.RESERVATION_DONE);
        STATUSES_BUSINESS_TRIP_EDITABLE.add(BusinessTripStatus.FINISHED);
    }

    public static Set<BusinessTripStatus> getStatusesWhenBusinessTripEditable() {
        return STATUSES_BUSINESS_TRIP_EDITABLE;
    }

    BusinessTripStatus(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
