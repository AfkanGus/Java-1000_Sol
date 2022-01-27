package src.rash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A1 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportAndNames = new HashMap<>();
        HashMap<Integer, String> passportAndNames2 = new HashMap<>();

        passportAndNames.put(212133, "Лидия Аркадьевна Бубликова");
        passportAndNames.put(162348, "Иван Михайлович Серебряков");
        passportAndNames.put(8082771, "Дональд Джон Трамп");
        passportAndNames.put(162348, "Виктор Михайлович Стычкин");

        passportAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportAndNames2.put(925648, "Максим Олегович Архаров");

        for (Map.Entry entry : passportAndNames.entrySet()) {
            System.out.println(entry);
        }

        String lidiaName = passportAndNames.get(212133);
        System.out.println(lidiaName);
        passportAndNames.remove(162348);
        System.out.println(passportAndNames.size());
        System.out.print(passportAndNames);

        if (!passportAndNames.isEmpty()) {
            System.out.println(passportAndNames);
        }
        passportAndNames.putAll(passportAndNames2);
        System.out.println(passportAndNames);

        /*
        Получение списка всех ключей и значений
         */
        Set<Integer> keys = passportAndNames.keySet();
        System.out.println(keys);

        ArrayList<String> values = new ArrayList<>(passportAndNames.values());
        System.out.println(values);
    }
}
