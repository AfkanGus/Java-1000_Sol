package src.tracker;

public class Computer {
    private int value;

    public Computer(int size) {
        this.value = size;
    }

    public void pour(Computer another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Computer first = new Computer(10);
        Computer second = new Computer(2);
        first.pour(second);
        System.out.println(first.value + second.value);
        second.pour(first);
        System.out.println(first.value + second.value);
    }
}
