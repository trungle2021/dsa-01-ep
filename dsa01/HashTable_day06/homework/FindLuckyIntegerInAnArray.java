package HashTable_day06.homework;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1394. Find Lucky Integer in an Array
 * Easy
 * Topics
 * Companies
 * Hint
 * Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
 *
 * Return the largest lucky integer in the array. If there is no lucky integer return -1.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,2,3,4]
 * Output: 2
 * Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
 * Example 2:
 *
 * Input: arr = [1,2,2,3,3,3]
 * Output: 3
 * Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
 * Example 3:
 *
 * Input: arr = [2,2,2,3,3]
 * Output: -1
 * Explanation: There are no lucky numbers in the array.
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 500
 * 1 <= arr[i] <= 500
 */

public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
//        int[] arr = {2,2,3,4};
//        int[] arr = {1,2,2,3,3,3};
//        int[] arr = {2,2,3,4};
        int[] arr = {2,2,2,3,3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        Arrays.sort(arr);
        int largest = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num: arr){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        for (int key: hashMap.keySet()){
            if(key == hashMap.get(key)){
                largest = key;
            }
        }
        System.out.println(hashMap);
        return largest;
    }
}
