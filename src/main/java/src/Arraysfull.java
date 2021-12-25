package src;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysfull {
    public static void main(String[] args) {
      /*
      Arrays.fill()
       */
        int[] array = {7, 8, 9, 10, 11};
        Arrays.fill(array, 2, 5, 0);
        System.out.println(Arrays.toString(array));
    }
}