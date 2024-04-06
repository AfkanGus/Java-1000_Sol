package src.iterator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayItTest {
    @Test
    void whenMultiCallHasNextThenTrue() {
        //Arrange - подготовка данных для проверки.
        ArrayIt iterator = new ArrayIt(
                new int[]{1, 2, 3}
        );
        //Act - выполнения действия и сохранения результата.
        boolean result = iterator.hasNext();
        // Assert - оценка результат ожидаемому исходу.
        assertThat(result).isTrue();
        // этапы размещены в одной строке.
        assertThat(iterator.hasNext()).isTrue();
    }

    @Test
    void whenReadSequence() {
        ArrayIt iterator = new ArrayIt(
                new int[]{1, 2, 3}
        );
        assertThat(iterator.next()).isEqualTo(1);
        assertThat(iterator.next()).isEqualTo(2);
        assertThat(iterator.next()).isEqualTo(3);
    }
}