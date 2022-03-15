package src.horscol;

import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int gruops = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[gruops][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell >= cells) {
                cell = 0;
                row++;
            }
            array[row][cell] = num;
            cell++;
        }
        return array;
    }
}
