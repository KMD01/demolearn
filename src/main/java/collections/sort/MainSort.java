package collections.sort;

import collections.group.ContractPossibilities;
import collections.group.ContractType;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;

public class MainSort {
    public static void main(String[] args) {

    }

    private void sortContracts(List<ContractPossibilities> contractPossibilitiesList) {
        contractPossibilitiesList.sort((a, b) -> a.getContractType().compareTo(b.getContractType()));
    }
}
