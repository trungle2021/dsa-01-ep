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
        int n = 2;
//        int[] flowerbed = {1,0,0,0,0,0,1};
//        int[] flowerbed = {1,0,0,0,0,0,1};
//        int[] flowerbed = {1,0,0,0,0,0,0,1};
//        int[] flowerbed = {1,0,0,0,1,0,0};
        int[] flowerbed = {0,0,1,0,1};
//        int[] flowerbed = {1,0,1,0,1,0,1};
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed == null ? 0 : flowerbed.length;
        int result = 0;
        int emptyPlots = 0;

        if(length == 1 && flowerbed[0] == 0){
            return true;
        }

        if(flowerbed[0] == 0 && flowerbed[1] == 0) {
            result++;
        }

        if(flowerbed[length -1] == 0 && flowerbed[length - 2] == 0){
            result++;
        }

        for (int i = 0; i < length -1; i++) {
            int current = flowerbed[i];
            int next = flowerbed[i + 1];

            if(current == 0 && next == 0 || current == 0 && next == 1){
                emptyPlots += 1;
                if(emptyPlots - n >= 2) result++;
            }else {
                emptyPlots = 0;
            }
        }

        if(result >= n){
            return true;
        }

        return false;
    }
}
