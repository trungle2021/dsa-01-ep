package day01;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val){
        int n = nums == null ? 0 : nums.length;
        if(n > 100) return 0;
        for (int i = 0; i < n; i++){
//            if(nums[i])
        }
//        return k;
    }
}
