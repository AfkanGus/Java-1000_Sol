package src.list.arraylist;

import java.util.List;

public class SubList {
    /**
     * @param -    List<E> subList(int fromIndex, int toIndex) -
     * @param list
     * @param el
     * @return
     */
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (list.indexOf(el) == list.lastIndexOf(el)) {
            list.subList(0, 0);
        }
        return list.subList(list.indexOf(el), list.lastIndexOf(el));
    }
}
