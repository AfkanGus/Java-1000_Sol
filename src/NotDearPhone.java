import java.io.*;
import java.util.*;

public class NotDearPhone {
    public static void main(String[] args) throws IOException {
        String str;
        FileReader fin = new FileReader("c:/af/af.txt"); // Получение числа из файла
        Scanner sc = new Scanner(fin);
        str = sc.nextLine();
        FileWriter count = new FileWriter("c:/af/aff.txt");// Запись числа в файл
        count.write(str);
        count.close();
    }
}
/*Формат ввода
В единственной строке входного файла input.txt записано натуральное число от 1 до 100.
Формат вывода
В выходной файл output.txt нужно вывести в точности то же
число, которое задано во входном файле.
*/