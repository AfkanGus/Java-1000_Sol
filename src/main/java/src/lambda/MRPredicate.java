package src.lambda;

import java.util.function.Predicate;

/**
 * 4.3. Method reference и Predicate
 */
public class MRPredicate {
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
