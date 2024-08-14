package day01;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;

        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        List<Integer> secondRow = new ArrayList<>();
        firstRow.add(1);
        secondRow.add(1);
        secondRow.add(1);


        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 1; j <= i - 1; j++){
                row.add(1); 
            }
        }

        result.add(firstRow);





        return result;
    }


}
