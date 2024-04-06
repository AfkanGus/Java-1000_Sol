package src.iterator;
import java.util.Iterator;
//Итерация по элементам масива.
public class ArrayIt implements Iterator<Integer> {
    private int[] data;
    private int point = 0; //текущая позиц итерат в массиве.

    public ArrayIt(int[] data) { //принимает массив чисел.
        this.data = data; // инициализирует поле.
    }

    @Override
    public boolean hasNext() { // вернет тру если
        return point < data.length; // текущ позиц меньше длин массива
    }

    @Override
    public Integer next() { //вернет след элем массива
        return data[point++]; // и перемещ ук. вперед.
    }
}
