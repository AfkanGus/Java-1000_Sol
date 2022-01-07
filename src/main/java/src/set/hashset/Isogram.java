package src.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> str = new HashSet<>();
        str.addAll(Arrays.asList(s.split("")));
        return str.size() == s.length();
    }

    /*
    метод принимает строку - слово, и буквы ее в нижнем регистре
    вернуть булевое значение - если слово является isograma то метод вернет  true
     */
    public static void main(String[] args) {
        String s = "uncopyrightables";
        boolean b = Isogram.checkString(s);
        System.out.println(b);
    }
}
