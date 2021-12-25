package src;

import java.util.ArrayList;
import java.util.List;

public class Resizearray {
    public static void main(String[] args) {
        /*
        изменить размер массива, сохранив все его текущие элементы в Java.
         */
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int a : array) {
            System.out.println(a + " ");
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int a : array) {
            list.add(a);
        }
        System.out.println("\n" + list);
        list.add(100);
        System.out.println(list);
    }
}
