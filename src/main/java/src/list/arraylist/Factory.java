package src.list.arraylist;

import java.util.List;

public class Factory {
    /*
    Заполнения списка фабричным методом
     */
    public static void main(String[] args) {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
