package src.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    /*
    метод принимает массив строк - последовательность игровой комбинации
    метод должен вернуть true если комбинации выигрышная
     */
    public static boolean checkYourWin(String[] combination) {
        Set<String> str = new HashSet<>();
        str.addAll(Arrays.asList(combination));
        return str.size() == 1;
    }

    public static void main(String[] args) {
        String[] strings = {"@", "@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        System.out.println(win);
        String[] strings1 = {"&&", "&", "&&&", "&&&&"};
        boolean win1 = Jackpot.checkYourWin(strings1);
        System.out.println(win1);
    }
}
