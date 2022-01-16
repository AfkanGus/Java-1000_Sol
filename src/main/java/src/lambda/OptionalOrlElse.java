package src.lambda;

import java.util.Optional;

/**
 * 5.5. Optional. Методы orElse(), orElseGet()
 */
public class OptionalOrlElse {
    public static Integer orElse(Optional<Integer> optional) {
        return optional.orElse(-1);
   /*     Integer value = -1;
        if (optional.isPresent()) {
            value = optional.get();
        }
        return value;*/
    }
}

