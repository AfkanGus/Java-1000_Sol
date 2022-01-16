package src.lambda;

import java.util.function.Consumer;

/**
 * 4.1. Method reference. Обращение через класс и объект
 */
public class MethodReference {
    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
