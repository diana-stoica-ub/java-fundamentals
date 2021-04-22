package section12_threads.ex4;

import java.util.Arrays;
import java.util.List;

public class InterruptEx {
    public static void main(String[] args) {
        List<String> info = Arrays.asList("Hello", "there", "Hi", "again!");
        for (String s : info) {
            // Print a message
            System.out.println(s);
            if (Thread.interrupted()) {
                // We've been interrupted: no more printing.
                return;
            }
        }
    }
}
