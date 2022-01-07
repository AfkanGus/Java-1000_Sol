package src.collection.foreach;

public class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{"
                +
                "breed='"
                + breed
                + '\''
                +
                ", price="
                + price
                +
                '}';
    }
}
