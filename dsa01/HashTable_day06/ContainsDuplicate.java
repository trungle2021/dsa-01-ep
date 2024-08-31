package HashTable_day06;

import java.util.HashMap;

/**
 * 217. Contains Duplicate
 * Solved
 * Easy
 * Topics
 * Companies
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Boolean> map = new HashMap();
        for(int i = 0; i < n; i++){
            if (map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], false);
        }
        return false;
    }
}
