package src.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids;
    private int size = 0;

    public Item add(Item item) { //добавление заявок.
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) { // полуение заявки по id.
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                rsl = item;
            }
        }
        return rsl;
    }

    public Item[] findAll() { //возвратить копию массива без нулл элем.
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) { // Получить список по имени
        int digit = 0; // текущий индекс
        Item[] findItems = new Item[size];
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                findItems[digit] = items[i];
                digit++;
            }
        }
        return Arrays.copyOf(findItems, digit);
    }


    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item bug = new Item(1, "Bug");
        Item item = tracker.add(bug);
        Item result = tracker.findById(item.getId());
        System.out.println(result.getId());
    }
}
