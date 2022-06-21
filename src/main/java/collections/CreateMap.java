package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateMap {

    BusinessTripRepository businessTripRepository;

    private void sendReminderAtTheEndOfTheMonth() {
        List<BusinessTripStatus> statuses = List.of(BusinessTripStatus.FINISHED, BusinessTripStatus.DOCS_TO_UPDATE);
        List<BusinessTrip> businessTripsToRemind = businessTripRepository.findAllByStatuses(statuses);
        Map<Account, List<BusinessTrip>> accountTripsMap = new HashMap<>();
        businessTripsToRemind.forEach(trip -> collectTripToMap(accountTripsMap, trip));
    }

    private void collectTripToMap(Map<Account, List<BusinessTrip>> accountTripsMap, BusinessTrip trip) {
        Account account = trip.getAccount();
        List<BusinessTrip> bt = accountTripsMap.get(account);
        if (bt==null) {
            List<BusinessTrip> trips = new ArrayList<>();
            trips.add(trip);
            accountTripsMap.put(trip.getAccount(),trips);
        } else {
            bt.add(trip);
            accountTripsMap.put(trip.getAccount(), bt);
        }
    }


}
