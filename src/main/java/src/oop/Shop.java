package src.oop;

public class Shop {
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 50);
        boolean eq = first.equals(second);
        System.out.println(eq);

    }
}
