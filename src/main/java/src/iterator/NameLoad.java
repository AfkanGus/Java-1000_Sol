package src.iterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 класс принимает массив строк вида {key=value, key1=value1, key2=value2},
  проверяет каждую строку на соответствие формату "ключ=значение",
   разделяет строку на пару ключ - значение и помещает эту пару в карту.
 */
public class NameLoad {
    private final Map<String, String> values = new HashMap<>();

    public void parse(String... names) {
        if (names.length == 0) {
            throw new IllegalArgumentException("Names array is empty");
        }
        values.putAll(Arrays.stream(names)
                .map(String::trim)
                .filter(this::validate)
                .map(line -> line.split("=", 2))
                .collect(Collectors.toMap(
                        e -> e[0],
                        e -> e[1],
                        (first, second) -> "%s+%s".formatted(first, second)
                )));
    }


    private boolean validate(String name) {
        if (!name.contains("=")) {
            throw new IllegalArgumentException(
                    "this name: %s does not contain the symbol '='".formatted(name));
        }
        if (name.startsWith("=")) {
            throw new IllegalArgumentException("this name: %s does not contain key".formatted(name));
        }
        if (name.indexOf("=") == name.length() - 1) {
            throw new IllegalArgumentException("this name: %s does not contain values".formatted(name));
        }
        return true;
    }

    public Map<String, String> getMap() {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("Коллекция пуста");
        }
        return values;
    }

}


