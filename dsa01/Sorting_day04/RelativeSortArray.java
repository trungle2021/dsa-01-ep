package Sorting_day04;

import java.util.*;

/**
 *  Relative Sort Array
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 *
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
 *
 * Example 1:
 *
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * Example 2:
 *
 * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
 * Output: [22,28,8,6,17,44]
 *
 *
 * Constraints:
 *
 * 1 <= arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * All the elements of arr2 are distinct.
 * Each arr2[i] is in arr1.
 */

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,2,19,9}, arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] frequency = new int[1001]; // Frequency array for arr1 elements

        // Count frequency of each element in arr1
        for (int num : arr1) {
            frequency[num]++;
        }

        int index = 0;

        // Place elements of arr2 in correct order
        for (int num : arr2) {
            while (frequency[num] > 0) {
                arr1[index++] = num;
                frequency[num]--;
            }
        }

        // Place remaining elements in ascending order
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                arr1[index++] = i;
                frequency[i]--;
            }
        }

        return arr1;
    }

    public static int[] relativeSortArray2(int[] arr1, int[] arr2) {
        List<Integer> result =  new ArrayList<>();
        Arrays.sort(arr1);



        TreeMap<Integer, Integer> map = new TreeMap<>();
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
           if (map.containsKey(arr1[i])){
                count++;
           }else{
               count = 1;
           }
            map.put(arr1[i], count);
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < map.get(arr2[i]); j++) {
                result.add(arr2[i]);
            }
            map.remove(arr2[i]);
        }

        while(map.size() != 0){
            int key = map.firstKey();
            for (int j = 0; j < map.get(key); j++) {
                result.add(key);
            }
            map.remove(key);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
