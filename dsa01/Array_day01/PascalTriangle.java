package Array_day01;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 6;

        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        List<Integer> secondRow = new ArrayList<>();

        firstRow.add(1);
        secondRow.add(1);
        secondRow.add(1);

        result.add(firstRow);

        if (numRows == 1){
            return result;
        }
        result.add(secondRow);

        if (numRows == 2){
            return result;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j <= i - 1; j++){
                Integer value1 = result.get(i-1).get(j-1);
                Integer value2 = result.get(i-1).get(j);
                row.add(value1 + value2);
            }
            row.add(1);
            result.add(row);
        }

        return result;
    }


}
