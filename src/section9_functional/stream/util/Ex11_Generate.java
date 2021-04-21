package section9_functional.stream.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex11_Generate {

    public static void main(String[] args) {
        // creates a sequence of ten strings with the value – “element”.
        Stream<String> streamGenerated =
                Stream.generate(() -> "element").limit(10);

        List<String> collect = streamGenerated.collect(Collectors.toList());
        System.out.println(collect);
    }
}
