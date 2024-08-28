package Recursion_day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 509. Fibonacci Number
 * Easy
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * Example 2:
 *
 * Input: n = 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * Example 3:
 *
 * Input: n = 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 *
 *
 * Constraints:
 *
 * 0 <= n <= 30
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        n = 8;
        System.out.println(fib2(n));
    }

    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;

        List<Integer> arr = new ArrayList<>();
        arr.add(f0);
        arr.add(f1);

        if(n < 2){
            return n;
        }

        for (int i = 2; i <= n; i++) {
            arr.add(i, arr.get(i - 2) + arr.get(i - 1));
        }

        return arr.get(arr.size()-1);
    }

    public static int fib2(int n) {
        if(n < 2){
            return n;
        }
        return fib2(n-1) + fib2(n-2);
    }
}
