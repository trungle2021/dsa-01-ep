package Recursion_day03;

/**
 * 326. Power of Three
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 *
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 27
 * Output: true
 * Explanation: 27 = 33
 * Example 2:
 *
 * Input: n = 0
 * Output: false
 * Explanation: There is no x where 3x = 0.
 * Example 3:
 *
 * Input: n = -1
 * Output: false
 * Explanation: There is no x where 3x = (-1).
 *
 *
 * Constraints:
 *
 * -231 <= n <= 231 - 1
 */
public class PowerOfThree {
    public static void main(String[] args) {
        int n = 81;
        System.out.println(isPowerOfThree4(n));
    }
    public static boolean isPowerOfThree(int n) {
        if ( n <= 0) return false;
        if (n % 3 != 0) return false;

        int result =n/3;

        while (result % 3 == 0){
            result/=3;
        }
        return result == 1;
    }


    public static boolean isPowerOfThree2(int n) {
        if ( n <= 0) return false;
        if (n%3 != 0) return false;
        return true;
    }

    public static boolean isPowerOfThree3(int n) {
        if ( n <= 0) return false;

        for (int i = 0; i <= n; i++) {
            if (Math.pow(3,i) == n){
                return true;
            }
        }
        return false;
    }

    public static boolean isPowerOfThree4(int n) {
        if ( n <= 0) return false;
        if (n==1) return true;
        if (n % 3 != 0) return false;
        return isPowerOfThree4(n/3);
    }

}
