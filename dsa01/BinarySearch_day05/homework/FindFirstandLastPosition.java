package BinarySearch_day05.homework;

import java.util.Arrays;

/**
 * Find First and Last Position of Element in Sorted Array
 * Medium
 * Topics
 * Companies
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 * <p>
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */

public class FindFirstandLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 5, 7, 8, 8, 10};
//        int[] nums = {1, 2, 3, 4, 5, 6, 6, 7, 9};
//        int[] nums = {4,5,5,7,8,9,10,12,13,14};
//        int[] nums = {4,5,5,7,8,9,10,12,13,14};
//        int[] nums = {4,5,5,7,8,9,10,12,13,14};
//        int[] nums = {4};
//        int[] nums = {2,2};
        int target =8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findStartPosition(nums, target), findEndPosition(nums, target)};
    }

    public static int findStartPosition(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int startPosition = -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                startPosition = mid;
                right = mid - 1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return startPosition;
    }
    public static int findEndPosition(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int endPosition = -1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                endPosition = mid;
                left = mid + 1;
            }else if (nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return endPosition;
    }
}
