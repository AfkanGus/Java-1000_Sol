package src.lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 5.2. Optional. Методы isPresent(), isEmpty(), get()
 */
public class OptionalGetAndIsPresentTest {
    @Test
    public void whenExist() {
        assertEquals(
                1,
                OptionalGetAndIsPresent.get(
                        new int[]{1, 2, 3},
                        2
                )
        );
    }

    @Test
    public void whenNotExist() {
        assertEquals(
                -1,
                OptionalGetAndIsPresent.get(
                        new int[]{1, 2, 3},
                        4
                )
        );
    }
}