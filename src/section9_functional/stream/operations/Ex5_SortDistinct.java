package section9_functional.stream.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5_SortDistinct {

    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("A", "C", "B", "D", "A", "B", "C");

        // Get collection without duplicate i.e. distinct only
        List<String> distinctElements = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct elements:");
        System.out.println(distinctElements);

        System.out.println("Distinct & sorted elements:");
        List<String> distinctAndSortedElements = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(distinctAndSortedElements);
    }
}
