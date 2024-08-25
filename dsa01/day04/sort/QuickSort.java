package day04.sort;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,1,6,8,3);
        System.out.println(quickSort(list));
    }

    public static List<Integer> quickSort (List<Integer> list){
        int n = list.size();
        int left = 0, right = n-1;
        int mid = (left + n-1)/2;
        int pivot = list.get(mid); 
        // base case
        if (left < right){

        }

        return list;
    }
}
