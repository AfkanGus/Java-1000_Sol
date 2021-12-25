package src.list.arraylist;

import java.util.List;

public class RepositionElement {
    /*
    Удалени и замена элементов в списке
    E remove(int i) - удаление по индексу, возврат удаленного элемента
    E set(int i, E e) - меняет значение элемента, который имеет i значением e
     */
    public static List<String> changePosition(List<String> list, int i) {
        String last = list.remove(list.size() - 1);
        if (list.size() - 1 >= i) {
            list.set(i, last);
        }
        return list;
    }
}
