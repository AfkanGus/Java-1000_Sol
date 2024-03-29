package src.lambda;

import java.util.function.Function;

/**
 * 2.3. Function. Рассчитать значение по формуле
 */
public class FunctionFormula {
    public static double calculate(double x) {
        return calculate(num -> num * num + 2 * num + 1, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
