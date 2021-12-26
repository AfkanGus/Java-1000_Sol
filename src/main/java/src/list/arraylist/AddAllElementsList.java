package src.list.arraylist;

import java.util.List;

public class AddAllElementsList {
    /**
     *
     * @param left - список
     * @param right - списол.
     * @param str - вернуть индекс элемента, который пришел в параметрах метода из общего списка.
     * @return вернуть индекс элемента, который пришел в параметрах метода из общего списка
     */
    public static int containsElement(List<String> left, List<String> right, String str) {
        //роверить оба списка, содержат ли они одновременно этот элемент
        if (left.contains(str) && right.contains(str)) {
            //если содержит - необходимо удалить элемент из первого списка.
            left.remove(str);
        }
        //Потом второй список нужно добавить в первый.
        left.addAll(right);
        //вернуть индекс элемента, который пришел в параметрах метода из общего списка.
        return left.indexOf(str);
    }
}
