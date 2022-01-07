package src.collection.aninmclass;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oi", 5, 25, 455);
        Animal dog = new Animal("Oij", 6, 23, 409);
        Animal bird = new Animal("Ahwj", 56, 22, 234);
        Animal[] c = {cat, dog, bird};
        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price;
            }
        });
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
        System.out.println();
        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.speed - o2.speed;
            }
        });
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
        Arrays.sort(c, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.breed.compareTo(o2.breed);
            }
        });
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}