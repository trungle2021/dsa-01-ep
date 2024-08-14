package day01;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement2(nums, val));
    }

    public static int removeElement2(int[] nums, int val){
        int n = nums == null ? 0 : nums.length;
        int i = 0;
       while(i < n){
           if(nums[i] != val){
               nums[i] = nums[n-1];
               n--;
           }else{
               i++;
           }
       }
       return n;
    }

//    public static int removeElement(int[] nums, int val){
//        int n = nums == null ? 0 : nums.length;
//        int j = 0;
//       for(int i = 0; i < n; i++){
//           if(nums[i] != val){
//               nums[j] = nums[i];
//               j++;
//           }
//       }
//        return j;
//    }
}
