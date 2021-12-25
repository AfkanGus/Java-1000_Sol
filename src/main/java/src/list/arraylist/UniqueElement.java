package src.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {
    /*
    Найти индекс элемента
     */
    public static boolean checkList(List<String> list, String str) {
        if (list.indexOf(str) == list.lastIndexOf(str)
                && list.indexOf(str) != -1) {
            return true;
        }
        return false;
    }
}
