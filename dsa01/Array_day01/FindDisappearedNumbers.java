package Array_day01;

import java.util.*;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 *
 *
 * Constraints:
 *
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 *
 *
 * Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class FindDisappearedNumbers {
    public static void main(String[] args) {
//        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers2(nums));
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        int n = nums == null ? 0 : nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int valueCurrentIdx = Math.abs(nums[i])-1;
            nums[valueCurrentIdx] = -Math.abs(nums[valueCurrentIdx]);
        }

        for (int i = 1; i <= n; i++) {
            if(nums[i-1] > 0) result.add(i);
        }
        return result;
    }
//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        int n = nums == null ? 0 : nums.length;
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 1; i <= n; i++) {
//            set.add(i);
//        }
//
//        for (int i = 0; i < n; i++) {
//            set.remove(nums[i]);
//        }
//
//        return new ArrayList<>(set);
//    }


}
