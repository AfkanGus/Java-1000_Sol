package src.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = s -> System.out.println();
        Consumer<String> ln = l -> System.out.print(input);
        return ln.andThen(print);
    }
}