package src.lambda.urma;

import java.util.function.Function;

public class MRFunction {

    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
