package BinarySearch_day05;

/**
 * Arranging Coins
 * Solved
 * Easy
 * Topics
 * Companies
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
 *
 * Given the integer n, return the number of complete rows of the staircase you will build.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: n = 5
 * Output: 2
 * Explanation: Because the 3rd row is incomplete, we return 2.
 * Example 2:
 *
 *
 * Input: n = 8
 * Output: 3
 * Explanation: Because the 4th row is incomplete, we return 3.
 *
 *
 * Constraints:
 *
 * 1 <= n <= 231 - 1
 */

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }

    public static int arrangeCoins(int n)
    {
      int left = 1;
      int right = n;

      while (left <= right){
          long mid = left + (right - left)/2;
          long currCoins = (mid * (mid + 1))/2;
          if (currCoins == n){
              return (int) mid;
          }else if (currCoins > n){
              right = (int) mid - 1;
          }else {
              left = (int) mid + 1;
          }
      }
        return right;
    }
    public static int arrangeCoins2(int n) {
        if (n == 1) return 1;
        int maxCoin = 0;
        int rowTH = 1;
        for(int i = 1; i <= n; i++){
            maxCoin += i;
            if (maxCoin > n){
                rowTH--;
                break;
            }
            rowTH++;
        }

    return rowTH;

    }
}
