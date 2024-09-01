package HashTable_day06;

import java.util.HashMap;

/**
 * 560. Subarray Sum Equals K
 * Medium
 * Topics
 * Companies
 * Hint
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 */

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1}; int k = 3;
        subarraySum(nums, k);
//        System.out.println(subarraySum(nums, k));
    }

    public static void subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();
        prefixSum.put(nums[0], 0 );
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < nums.length; j++) {
                int ps = prefixSum.getOrDefault(i-1, 0) + nums[i];
                prefixSum.put(ps, i);
//                System.out.print("j:" + j+ " ");
            }
            System.out.println(prefixSum);
            System.out.println();

        }

//        return p.get(k);
    }
}
