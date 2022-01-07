package src.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(5);
        a1.add(8);
        System.out.println(a1);

        Iterator<Integer> iterator = a1.iterator();
        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }
        ListIterator<Integer> listIterator = a1.listIterator();
        while (listIterator.hasNext()) {
            Integer tmp1 = listIterator.next();
            System.out.println(tmp1);
        }
    }
}
