package src.lambda;

import java.util.function.Consumer;

/**
 * 3.1. Consumer. Вывод строки. Метод andThen()
 */
public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = s -> System.out.println();
        Consumer<String> ln = l -> System.out.print(input);
        return ln.andThen(print);
    }
}