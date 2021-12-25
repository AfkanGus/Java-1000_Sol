package src;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * For-each loop in Java.
 * For - each is another array traversing technique like for loop,
 * while loop, do - while loop introduced in Java 5.
 * - it starts with the keyword for like a normal for-loop.
 * - Instead of declaring and initializing a loop counter variable,
 * you declare a variable that is the same type as the base type of the array,
 * followed by a colon, which is then followed by the array name.
 * - in the loop body, you can use the loop variable you created rather than
 * an indexed array element.
 * - It's commonly used to iterate over an array or a Collections class.
 */
public class Foreach {
    public static void main(String[] args) {
        int[] rsl = {123, 145, 122, 133, 56, 12};
        IntStream intStream = Arrays.stream(rsl);
        OptionalInt optionalInt = intStream.max();
        int max = optionalInt.getAsInt();
        System.out.println(max);
    }
}
