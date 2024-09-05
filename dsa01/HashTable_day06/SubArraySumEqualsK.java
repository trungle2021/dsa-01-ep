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
        int[] nums = {1,2,1,2,1}; int k = 1;
        System.out.println(subarraySum(nums, k));
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1);
        int count = 0;
        int currentSum = 0;

        for (int num: nums){
            currentSum += num;

            if(prefixSumMap.containsKey(currentSum-k)){
                count+=prefixSumMap.getOrDefault(currentSum-k, 0);
            }

            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum-k, 0) + 1);
        }
        return count;
    }
}
