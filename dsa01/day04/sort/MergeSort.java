package day04.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,7,9,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        int mid = arr.length / 2;
        // dividing array to subarrays
        int[] a = new int[mid];
        System.arraycopy(arr, 0, a, 0, mid);

        int[] b = new int[mid];
        System.arraycopy(arr, 0, b, mid, arr.length - 1);
        return arr;

    }

    public static int[] merge(int[] a, int[] b){
        return new int[7];
    }
}
