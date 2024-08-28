package Recursion_day03.homework;

/**
 * 1837. Sum of Digits in Base K
 * Easy
 * Topics
 * Companies
 * Hint
 * Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.
 *
 * After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 34, k = 6
 * Output: 9
 * Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
 * Example 2:
 *
 * Input: n = 10, k = 10
 * Output: 1
 * Explanation: n is already in base 10. 1 + 0 = 1.
 *
 *
 * Constraints:
 *
 * 1 <= n <= 100
 * 2 <= k <= 10
 */

public class SumOfDigitsInBaseK {


    public static void main(String[] args) {
        int n = 34, k =6;
        System.out.println(sumBase(n, k));
    }
    public static int sumBase(int n, int k) {
      return sumBaseHelper(n, k, 0);
    }

    public static int sumBaseHelper(int n, int k, int sum){
        if (n == 0) return sum;
        int rmd = n % k;
        sum+= rmd;
        return sumBaseHelper(n/k, k, sum);
    }

//    public static int sumBase(int n, int k) {
//        int rmd;
//        int sum = 0;
//        while(n != 0){
//            rmd = n % k;
//            n = n / k;
//            sum += rmd;
//        }
//      return sum;
//    }
}
