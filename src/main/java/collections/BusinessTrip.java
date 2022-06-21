package collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@Getter
@Setter
public class BusinessTrip {

    String name;

    @ManyToOne
    @JoinColumn(name = "businessTripList")
    Account account;

}
