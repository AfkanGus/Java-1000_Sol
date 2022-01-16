package src.lambda;

import java.util.function.Function;

/**
 * 4.2. Method reference и Function
 */
public class MRFunction {
    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
