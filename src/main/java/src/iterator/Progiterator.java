package src.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Progiterator {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Ger");
        states.add("Fran");
        states.add("Ita");
        states.add("Span");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
