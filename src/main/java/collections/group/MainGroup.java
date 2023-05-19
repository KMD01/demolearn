package collections.group;

import java.util.List;

import static java.util.stream.Collectors.groupingBy;

public class MainGroup {
    public static void main(String[] args) {

    }

    private static List<ContractPossibilities> groupContracts(final List<ContractPossibilities> contractPossibilitiesList, ContractType contractType) {
        return contractPossibilitiesList.stream()
                .collect(groupingBy(ContractPossibilities::getContractType)).getOrDefault(contractType, List.of());
    }

    private static List<ContractPossibilities> filterContracts(final List<ContractPossibilities> contractPossibilitiesList, ContractType contractType) {
        return contractPossibilitiesList.stream().filter(a->a.getContractType().equals(contractType)).toList();
    }




}
