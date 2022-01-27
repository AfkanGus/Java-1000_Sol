package src.hash;

public class Calc {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int mult(int a) {
        return x * a;
    }

    public static void main(String[] args) {
        Calc c = new Calc();
        int rsl = c.mult(10);
        System.out.println(rsl);
    }
}
