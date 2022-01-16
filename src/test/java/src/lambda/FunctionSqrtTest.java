package src.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 2.2. Function. Получить корень квадратный из числа
 */
public class FunctionSqrtTest {
    @Test
    public void test() {
        assertEquals(2, FunctionSqrt.calculate(4), 0.01);
        assertEquals(3, FunctionSqrt.calculate(9), 0.01);
    }
}