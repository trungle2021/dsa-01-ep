package day01;

import java.util.ArrayList;

/**
 * 303. Range Sum Query - Immutable
 * Given an integer array nums, handle multiple queries of the following type:
 *
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 *
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 *
 *
 * Example 1:
 *
 * Input
 * ["NumArray", "sumRange", "sumRange", "sumRange"]
 * [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 * Output
 * [null, 1, -1, -3]
 *
 * Explanation
 * NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
 * numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
 * numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
 * numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -105 <= nums[i] <= 105
 * 0 <= left <= right < nums.length
 * At most 104 calls will be made to sumRange.
 */
public class NumArray {
    public static void main(String[] args) {
//        [[[1, 3, 5]], [0, 2], [1, 1], [0, 2]]
        int[] nums = {1,7,3,6};
        NumArray numArray = new NumArray(nums);
        numArray.printResult();
    }
    int[] prefixSum = {};
    ArrayList<java.io.Serializable> result = new ArrayList<>();

    public NumArray(int[] nums) {
        int n = nums == null ? 0 : nums.length;
        this.prefixSum = new int[n];
        assert nums != null;
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
       if(left == 0){
           return prefixSum[right];
       }else{
           return prefixSum[right] - prefixSum[left-1];
       }
    }

    public void printResult(){
        result.add(this.prefixSum.toString());
        sumRange(0,2);
        sumRange(1,1);
        sumRange(0,2);
        System.out.println(result);
    }
}
