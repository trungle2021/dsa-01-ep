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
        int[] nums = {5, 7, 7, 8, 8, 10};
//        int[] nums = {4,5,5,7,8,9,10,12,13,14};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = -1, end = -1;
        int left = 0, right = n - 1;
        int mid = left + (right - left) / 2;
       
        if (nums[left] == target) {
            start = 0;
        }

        while (left <= mid) {
            int m = left + (mid - left) / 2;

            if (nums[m] < target && (nums[m + 1] == target)) {
                start = m + 1;
                break;
            } else if (nums[m] == target) {
                mid = m - 1;
            } else {
                left = m + 1;
            }
        }


        left = start;

        while (left <= right) {
            int m = left + (right - left) / 2;
            if (nums[m] > target && (nums[m - 1] == target)) {
                end = m - 1;
                break;
            } else if (nums[m] == target) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }


        return new int[]{start, end};
    }
}
// 0 1 2 3 4 5 6  7 8 9 10 11 12
// 4 5 7 8 8 8 8 8 9 10 12 13 14


// 0 1 2 3 4 5  6  7  8  9 10 11 12
// 4 5 7 8 8 9 10 11 12 13 14 15 16