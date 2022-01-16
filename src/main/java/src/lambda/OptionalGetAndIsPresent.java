package src.lambda;

import java.util.Optional;

/**
 * 5.2. Optional. Методы isPresent(), isEmpty(), get()
 */
public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        Optional index = OptionalGetAndIsPresent.indexOf(data, el);
        return index.isPresent() ? (int) index.get() : -1;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
