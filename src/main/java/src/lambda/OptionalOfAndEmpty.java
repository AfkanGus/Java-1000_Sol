package src.lambda;

import java.util.List;
import java.util.Optional;

/**
 * 5.1. Optional. Методы of() и empty()
 */
public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        return strings.contains(value) ? Optional.of(value) : Optional.empty();
    }
}
