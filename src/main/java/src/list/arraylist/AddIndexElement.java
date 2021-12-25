package src.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    /*
    Добавления элемента в списко по индексу
     */
    public static boolean addNewElement(List<String> list, int i, String str) {
        List<String> check = new ArrayList<>(list);
        for (String s : list) {
            if (!str.contains(s)) {
                check.add(i, str);
            } else {
                return false;
            }
        }
        return list.size() != check.size();
    }
}
