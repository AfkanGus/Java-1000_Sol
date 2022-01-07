package src.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<String>(Arrays.asList(s.split("")));
        Collections.sort(list);
        StringBuilder str = new StringBuilder();
        for (String string : list) {
            str.append(string);
        }
        return str.toString();
    }
}
