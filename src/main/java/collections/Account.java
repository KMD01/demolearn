package collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Account {

    String userName;
    String lastName;

    @OneToMany (mappedBy = "name")
    List<BusinessTrip> businessTripList;

}
