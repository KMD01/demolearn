package generalSolutions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.lang.reflect.Type;
import java.net.Proxy;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Enumerated(EnumType.STRING)
    Status status;
}
