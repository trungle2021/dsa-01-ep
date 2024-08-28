package BinarySearch_day05.homework;

import java.util.Arrays;

/**
 * Find First and Last Position of Element in Sorted Array
 * Medium
 * Topics
 * Companies
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,7,7,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 *
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */

public class FindFirstandLastPosition {
    public static void main(String[] args) {
        int[] nums = {2,2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int midPosition = -1;

        if (n == 0) {
            return new int[] { -1, -1 };
        }

        if (n == 1 && nums[0] == target) {
            return new int[] { 0, 0 };
        }


        if (n == 2) {
            if (nums[left] == target && nums[right] == target) {
                return new int[] { left, right };
            } else if (nums[left] == target && nums[left] != nums[right]) {
                return new int[] { left, left };
            } else if(nums[right] == target && nums[left] != nums[right]){
                return new int[] { right, right };
            }else{
                return new int[] {-1,-1};
            }
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                midPosition = mid;
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (midPosition == -1) {
            return new int[] { -1, -1 };
        }

        if (nums[midPosition] == target) {
            // separate left side and right side
            // For left side, right = mid
            int startPositionLeft = 0, endPositionLeft = midPosition;
            while (startPositionLeft <= endPositionLeft) {
                int mid = startPositionLeft + (endPositionLeft - startPositionLeft) / 2;
                if (nums[mid] == target && nums[mid - 1] != target) {
                    startPositionLeft = mid;
                    break;
                } else if (nums[mid] > target) {
                    endPositionLeft = mid - 1;
                } else {
                    startPositionLeft = mid + 1;
                }
            }

            // For right side, left = mid
            int startPositionRight = midPosition, endPositionRight = nums.length - 1;
            while (startPositionRight <= endPositionRight) {
                int mid = startPositionRight + (endPositionRight - startPositionRight) / 2;
                if (nums[mid] == target && nums[mid + 1] != target) {
                    startPositionRight = mid;
                    break;
                } else if (nums[mid] > target) {
                    endPositionRight = mid - 1;
                } else {
                    startPositionRight = mid + 1;
                }
            }

            return new int[] { startPositionLeft, startPositionRight };
        }

        return new int[] { -1, -1 };
    }
}
