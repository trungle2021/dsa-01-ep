package day04.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 4, 3, 7, 9, 1);
        System.out.println(mergeSort(list));
    }

    public static List<Integer> mergeSort(List<Integer> list) {
       int n = list.size();
       if (n <= 1) return list;
       int mid = n/2;

       // dividing list into smaller list. ( two halves )
        List<Integer> leftList = list.subList(0, mid);
        List<Integer> rightList = list.subList(mid, n);

        List<Integer> sortedLeft = mergeSort(new ArrayList<>(leftList));
        List<Integer> sortedRight = mergeSort(new ArrayList<>(rightList));

        return merge(sortedLeft, sortedRight);
    }

    public static List<Integer> merge(List<Integer> leftList, List<Integer> rightList){
        List<Integer> mergedList = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while(leftIndex < leftList.size() && rightIndex < rightList.size()){
            if (leftList.get(leftIndex) <= rightList.get(rightIndex)){
                mergedList.add(leftList.get(leftIndex));
                leftIndex++;
            }else{
                mergedList.add(rightList.get(rightIndex));
                rightIndex++;
            }
        }

        while(leftIndex < leftList.size()){
            mergedList.add(leftList.get(leftIndex));
            leftIndex++;
        }

        while(rightIndex < rightList.size()){
            mergedList.add(rightList.get(rightIndex));
            rightIndex++;
        }

        return mergedList;
    }

}
