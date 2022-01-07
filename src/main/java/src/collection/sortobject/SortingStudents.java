package src.collection.sortobject;

import java.util.Arrays;

public class SortingStudents {
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String[] students = {"Alex", "Ale", "Yengen", "Lorina"};

        Arrays.sort(marks);
        Arrays.sort(students);
        for (int tmp : marks) {
            System.out.println(tmp + "");

        }
        System.out.println();
        for (String tmp : students) {
            System.out.println(tmp + " ");
        }
    }

}
