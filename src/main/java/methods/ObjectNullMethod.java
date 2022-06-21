package methods;

import java.util.Objects;

public class ObjectNullMethod {

    public boolean check(String name){
        return Objects.isNull(name);
    };

}
