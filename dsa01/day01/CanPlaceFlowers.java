package day01;

/**
 * 605. Can Place Flowers
 * Easy
 * Topics
 * Companies
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 *
 * Example 1:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 * Example 2:
 *
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 *
 * Constraints:
 *
 * 1 <= flowerbed.length <= 2 * 104
 * flowerbed[i] is 0 or 1.
 * There are no two adjacent flowers in flowerbed.
 * 0 <= n <= flowerbed.length
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {
        int n = 0;
//        int[] flowerbed = {1,0,0,0,0,0,1};
//        int[] flowerbed = {1,0,0,0,0,0,0,1};
//        int[] flowerbed = {1,0,0,0,1,0,0};
//        int[] flowerbed = {0,0,1,0,1};
//        int[] flowerbed = {1,0,1,0,1,0,1};
//        int[] flowerbed = {1,0,0,1,1,0,0};
//        int[] flowerbed = {0,0,1,0,0};
//        int[] flowerbed = {0,0};
        int[] flowerbed = {1};
//        int[] flowerbed = {0,0,0,0};
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed == null ? 0 : flowerbed.length;

        if(n==0){
            return true;
        }

        if(length == 1 && flowerbed[0] == 0) return true;
        if(length == 2 && (flowerbed[0] == 1 || flowerbed[1] == 1)) return false;
        if(length == 2 && n <= 1 && (flowerbed[0] == 0 && flowerbed[1] == 0)) return true;

        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }
        if (flowerbed[length -1] == 0 && flowerbed[length - 2] == 0){
            flowerbed[length-1] = 1;
            n--;
        }

        for (int i = 1; i < length -1; i++) {
            if(n<=0) return true;
            int before = flowerbed[i-1];
            int current = flowerbed[i];
            int next = flowerbed[i + 1];

            if(current == 0 && before == 0 && next == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return false;
    }
}
