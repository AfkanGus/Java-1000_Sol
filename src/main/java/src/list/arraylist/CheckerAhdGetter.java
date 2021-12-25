package src.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
boolean isEmpty() - проверяет содержится ли элемент в коллекции
E get(int i) - возвращает объект типа Е из списка по i
 */
public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        String string = " ";
        for (int i = 0; i < list.size(); i++) {
            if (!list.isEmpty()) {
                string = list.get(0);
            } else {
                return null;
            }
        }
        return string;
    }
}
