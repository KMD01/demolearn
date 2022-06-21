package collections;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BusinessTripRepository extends JpaRepository<BusinessTrip, Long> {

    @Query("select b " +
            "from BusinessTrip b " +
            "where b.status in :statuses")
    List<BusinessTrip> findAllByStatuses(List<BusinessTripStatus> statuses);

}
