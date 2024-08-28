package BinarySearch_day05;

/**
 * Valid Perfect Square
 * Solved
 * Easy
 * Topics
 * Companies
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 *
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 *
 * You must not use any built-in library function, such as sqrt.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 16
 * Output: true
 * Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 * Example 2:
 *
 * Input: num = 14
 * Output: false
 * Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 *
 *
 * Constraints:
 *
 * 1 <= num <= 231 - 1
 */

public class IsPerfectSquare {
    public static void main(String[] args) {
        int num =  14;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int lo = 1;
        int hi = num;

        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (mid*mid == num){
                return true;
            }else if (mid > num/mid) {
                hi = mid - 1;
            }else {
                lo = mid + 1;
            }
        }
        return false;
    }
}
