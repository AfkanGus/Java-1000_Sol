package src.collection;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        // System.out.println(list.add(1));
        //System.out.println(list.size());
        Collection<Integer> list2 = new ArrayList<>();
        System.out.println(list2.size());
        list2.addAll(list1);
        System.out.println(list2 + " " + list2.size());

        Object[] arra = list2.toArray();
        for (int i = 0; i < arra.length; i++) {
            System.out.println(arra[i]);

        }
        System.out.println(arra.length);
    }
}
