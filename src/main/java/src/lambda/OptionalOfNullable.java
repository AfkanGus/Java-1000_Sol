package src.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 5.4. Optional. Метод ofNullable()
 */
public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String str : strings) {
            if (Objects.equals(str, value)) {
                return Optional.ofNullable(str);
            }
        }
        return Optional.empty();
    }
}
