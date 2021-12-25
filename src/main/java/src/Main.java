package src;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        /*
        Найти максимальное число ИТЕРАТНЫМ способом.
         */
        int[] intArray = {24, 2, 0, 34, 12, 110, 2};
        int maxNum = intArray[0];
        for (int j : intArray) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        System.out.println(maxNum);
        /*
        Найти максимальное число с помощью Stream()
         */
        IntStream intStream = Arrays.stream(intArray);
        OptionalInt optionalInt = intStream.max();
        int max = optionalInt.getAsInt();
        System.out.println(max);
        /*
        с помощью Arrays.sort()
         */
        Arrays.sort(intArray);
        int maxNb = intArray[intArray.length - 1];
        System.out.println(maxNb);
    }
}

