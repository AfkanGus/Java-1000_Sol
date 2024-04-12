package src.iterator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
/*
4. Утверждения с исключениями [#504886 #345414].
 */
class NameLoadTest {
    @Test
    void checkEmpty() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(nameLoad::getMap)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("no data");
    }

    @Test
    void checkParseEmpty() {
        NameLoad nameLoad = new NameLoad();
        assertThatThrownBy(() -> nameLoad.parse())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Names array is empty");
    }

    @Test
    void checkParseNoEquals() {
        NameLoad nameLoad = new NameLoad();
        String invalidName = "invalid";
        assertThatThrownBy(() -> nameLoad.parse(invalidName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain the symbol '='")
                .hasMessageContaining(invalidName);
    }

    @Test
    void checkParseWithStartEquals() {
        NameLoad nameLoad = new NameLoad();
        String invalidName = "=invalid";
        assertThatThrownBy(() -> nameLoad.parse(invalidName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a key")
                .hasMessageContaining(invalidName);
    }

    @Test
    void checParseEndsWithEquals() {
        NameLoad nameLoad = new NameLoad();
        String invalidName = "invalid=";
        assertThatThrownBy(() -> nameLoad.parse(invalidName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a value")
                .hasMessageContaining(invalidName);
    }
}