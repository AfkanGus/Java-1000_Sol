package src.lambda;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

/**
 * 5.5. Optional. Методы orElse(), orElseGet()
 */
public class OptionalOrElseTest {
    @Test
    public void test() {
        assertEquals(Integer.valueOf(-1), OptionalOrlElse.orElse(Optional.empty()));
        assertEquals(Integer.valueOf(1), OptionalOrlElse.orElse(Optional.of(1)));
    }
}