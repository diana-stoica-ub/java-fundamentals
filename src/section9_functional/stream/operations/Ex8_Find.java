package section9_functional.stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex8_Find {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> first = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        if (first.isPresent()) { //return false if content is null
            System.out.println(first.get());
        } else {
            System.out.println("Not found");
        }

        list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> any = list.stream()
                .filter(n -> n % 2 == 0)
                .findAny();

        if (any.isPresent()) {
            System.out.println(any.get());
        }
    }
}
