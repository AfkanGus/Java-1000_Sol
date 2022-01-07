package src.collection.sortobject.animal;

import java.util.Comparator;

public class Animal {
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    static class ComparatorByPrice implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Animal) o1).price - ((Animal) o2).price;
        }
    }

    static class ComparatBySpeed implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Animal) o1).speed - ((Animal) o1).speed;
        }
    }

    static class ComparatorByWeight implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Animal) o1).weight - ((Animal) o2).weight;
        }
    }

    static class ComparatorByBreed implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Animal) o1).breed.compareTo(((Animal) o2).breed);
        }
    }
}
