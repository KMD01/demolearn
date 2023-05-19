package collections.group;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ContractPossibilities {
    ContractType contractType;
    Integer rate;
}
