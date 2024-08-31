package BinarySearch_day05;

/**
 * Single Element in a Sorted Array
 * Medium
 * Topics
 * Companies
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 *
 * Return the single element that appears only once.
 *
 * Your solution must run in O(log n) time and O(1) space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * Example 2:
 *
 * Input: nums = [3,3,7,7,10,11,11]
 * Output: 10
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 105
 */

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4,5,5,6,6,7,7};
        System.out.println(singleNonDuplicate(nums));

    }

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            boolean equalLeft = mid > 0 && nums[mid] == nums[mid-1];
            boolean equalRight = mid < n - 1 && nums[mid] == nums[mid+1];

            if (!equalLeft && !equalRight) return nums[mid];

            if (equalLeft && mid % 2 == 0 || equalRight && mid % 2 == 1){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1   ;
    }

}
