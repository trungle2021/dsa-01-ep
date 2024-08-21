package day03;

import java.util.HashSet;

/**
 * 202. Happy Number
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * Example 2:
 *
 * Input: n = 2
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= n <= 2^31 - 1
 */

public class HappyNumber {

    public static void main(String[] args) {
        int n = 52;
        System.out.println(isHappy2(n));
    }
    public static boolean isHappy(int n) {
        if (n == 1) return true;
        if(n<=4) return false;
        int sum = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        while (sum != 1){
            for (int i = 0; i < sb.length(); i++) {
                int c = Integer.parseInt(String.valueOf(sb.charAt(i)));
                sum += Math.pow(c, 2);
            }
            if (hashSet.contains(sum)){
                return false;
            }
            hashSet.add(sum);
            sb.setLength(0);
            sb.append(sum);
            if (sum == 1){
                return true;
            }else{
                sum = 0;
            }
        }
        return false;
    }

    public static boolean isHappy2(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int temp = 0;
        while( n != 1){
            if (seen.contains(n)){
                return false;
            }
            seen.add(n);
            //break up n into parts and perform actions
            while (n > 0){
                temp += Math.pow(n % 10, 2);
                n = n/10;
            }
            //set n and reset temp
            n = temp;
            temp = 0;
        }
        return true;
    }
}
