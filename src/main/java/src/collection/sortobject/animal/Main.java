package src.collection.sortobject.animal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oi", 5, 25, 455);
        Animal dog = new Animal("Oij", 6, 23, 409);
        Animal bird = new Animal("Ahwj", 56, 22, 234);
        Animal[] c = {cat, dog, bird};
        Arrays.sort(c, new Animal.ComparatorByPrice());
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
        System.out.println();

        Arrays.sort(c, new Animal.ComparatBySpeed());
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
        System.out.println();
        Arrays.sort(c, new Animal.ComparatorByBreed());
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
        System.out.println();
        Arrays.sort(c, new Animal.ComparatorByWeight());
        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
