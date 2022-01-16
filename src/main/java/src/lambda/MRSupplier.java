package src.lambda;

import java.util.function.Supplier;

/**
 * 4.4. Method reference и Supplier
 */
public class MRSupplier {
    public static Supplier<String> supplier() {
        return String::new;
    }
}
