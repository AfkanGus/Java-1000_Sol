package src.lambda;

import org.junit.Test;

import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

/**
 * 4.4. Method reference и Supplier
 */
public class MRSupplierTest {
    @Test
    public void test() {
        Supplier<String> supplier = MRSupplier.supplier();
        assertEquals("", supplier.get());
    }
}