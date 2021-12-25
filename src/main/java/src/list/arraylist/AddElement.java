package src.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    /*
    Размер спска и добавленя элементов.
     */
    public static boolean addNewElemetn(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        if (check.size() == list.size()) {
            return  list.add(str);
        }
        return false;
    }
}
