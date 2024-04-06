package src.hashmap;

import java.util.Objects;

public interface MyMapInterface {
    int size();

    boolean isEmpty();

    Objects get(Objects key);

    Objects put(Objects key, Objects value);

    interface Entry<k, v> {
        k getKey();

        v getValue();
    }
}
