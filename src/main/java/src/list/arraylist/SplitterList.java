package src.list.arraylist;

import java.util.List;

public class SplitterList {
    /**
     * @param left   - Общий список элементов;
     * @param middle -Список важных элементов, но не обязательных;
     * @param right  -Список элементов, которые обязательно должны
     *               отсутствовать в результирующем списке.
     * @return
     */
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        System.out.println(left);
        return left;

    }
}
