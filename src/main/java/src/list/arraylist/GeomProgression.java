package src.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {

    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>(count);
        int sum = 0;
        int elem = 0;
        for (int i = 0; i < count; i++) {
            elem = (int) (first * Math.pow(denominator, i));
            list.add(elem);
            sum += elem;
        }
        return sum;
    }
}
