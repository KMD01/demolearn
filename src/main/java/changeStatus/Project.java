package changeStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Enumerated(EnumType.STRING)
    Status status;

    boolean isActive;
}
