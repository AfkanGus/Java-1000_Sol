package src.collection.aninmclass;

public class Wh {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        while (i < 10) {
            i += 1;
            System.out.println("HW" + i);
            while (j < 5) {
                j++;
                System.out.println(j);
            }
        }
        int s = 0;
        do {
            s++;
            System.out.println(s);
        }
        while (s < 10);
    }
}
