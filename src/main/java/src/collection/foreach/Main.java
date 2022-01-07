package src.collection.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> al = new ArrayList<>();
        al.add(new Animal("Sphynx", 5000));
        al.add(new Animal("Malamute", 4000));

        Iterator<Animal> iterator = al.iterator();
        while (iterator.hasNext()) {
            Animal tmp = iterator.next();
            tmp.price += 1000;
        }
        System.out.println(al);
    }

}
