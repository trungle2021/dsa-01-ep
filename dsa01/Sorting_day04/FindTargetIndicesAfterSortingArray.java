package Sorting_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2089. Find Target Indices After Sorting Array

 * You are given a 0-indexed integer array nums and a target element target.
 *
 * A target index is an index i such that nums[i] == target.
 *
 * Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The indices where nums[i] == 2 are 1 and 2.
 * Example 2:
 *
 * Input: nums = [1,2,5,2,3], target = 3
 * Output: [3]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 3 is 3.
 * Example 3:
 *
 * Input: nums = [1,2,5,2,3], target = 5
 * Output: [4]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 5 is 4.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 1 <= nums[i], target <= 100
 */

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = mergeSort(Arrays.stream(nums).boxed().toList());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target){
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> mergeSort(List<Integer> nums){

        int n = nums.size();
        int mid = n/2;

        if (n == 1){
            return nums;
        }

        List<Integer> leftList = nums.subList(0, mid);
        List<Integer> rightList = nums.subList(mid, n);

        List<Integer> sortedLeft = mergeSort(leftList);
        List<Integer> sortedRight = mergeSort(rightList);

        return merge(sortedLeft, sortedRight);
    }

    public static List<Integer> merge(List<Integer> leftList, List<Integer> rightList){
        List<Integer> result = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftList.size() && rightIndex < rightList.size()){
            if (leftList.get(leftIndex) < rightList.get(rightIndex)){
                result.add(leftList.get((leftIndex)));
                leftIndex++;
            }else{
                result.add(rightList.get((rightIndex)));
                rightIndex++;
            }
        }

        while (leftIndex < leftList.size()){
            result.add(leftList.get((leftIndex)));
            leftIndex++;
        }
        while (rightIndex < rightList.size()){
            result.add(rightList.get((rightIndex)));
            rightIndex++;
        }

        return result;
    }
}
