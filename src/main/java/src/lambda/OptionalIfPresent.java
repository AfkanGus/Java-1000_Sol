package src.lambda;

import java.util.Optional;

/**
 * 5.3. Optional. Метод ifPresent()
 */
public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent(s -> System.out.println("Max: " + s));
    }

    private static Optional<Integer> max(int[] data) {
        //Если массив пуст, то возвращает пустой Optional
        if (data.length == 0) {
            return Optional.empty();
        }
        int max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i]) {
                max = data[i];
            }
        }
        return Optional.of(max);
    }
}
