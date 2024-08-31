package BinarySearch_day05;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 1;
        System.out.println(searchMatrix(matrix, target));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; // total number of rows
        int n = matrix[0].length; // total number of columns

        int left = 0; // start index of the 1D array
        int right = m * n - 1; // end index of the 1D array

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / n][mid % n];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
