package src.lambda;

import java.util.function.Function;

/*
2.2. Fuction. Получить корень квадратный из числа
 */
public class FunctionSqrt {
    public static double calculate(double x) {
        return calculate(s -> Math.sqrt(x), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
