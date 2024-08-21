package day03;

import java.util.ArrayList;
import java.util.List;

/**
 * 1545. Find Kth Bit in Nth Binary String
 * Medium
 *
 * Topics
 * Companies
 *
 * Hint
 * Given two positive integers n and k, the binary string Sn is formed as follows:
 *
 * S1 = "0"
 * Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
 * Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).
 *
 * For example, the first four strings in the above sequence are:
 *
 * S1 = "0"
 * S2 = "011"
 * S3 = "0111001"
 * S4 = "011100110110001"
 * S4 = "011100110110001"
 * Return the kth bit in Sn. It is guaranteed that k is valid for the given n.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, k = 1
 * Output: "0"
 * Explanation: S3 is "0111001".
 * The 1st bit is "0".
 * Example 2:
 *
 * Input: n = 4, k = 11
 * Output: "1"
 * Explanation: S4 is "011100110110001".
 * The 11th bit is "1".
 *
 *
 * Constraints:
 *
 * 1 <= n <= 20
 * 1 <= k <= 2n - 1
 */

public class FindKthBit {

     static List<String> arr = new ArrayList<>();
     static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = 1, k = 1 ;
        arr.add("0");
        System.out.println(findKthBit2(n, k));
    }

    public static StringBuilder reverse(StringBuilder sb){
        return sb.reverse();
    }

    public static StringBuilder invert(StringBuilder sb){
        int n = sb.length();
        if (n == 0) return new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) == '0'){
                sb.setCharAt(i,'1');
            }else if (sb.charAt(i) == '1'){
                sb.setCharAt(i, '0');
            }
         }
        return sb;
    }

    public static char findKthBit(int n, int k) {
        /**
         *  S1 = "0"
         *  Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
         */

        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String s1 = "0";
        arr.addFirst(s1);

        if(n==1){
            return '0';
        }

        for (int i = 2; i <= n; i++) {
            sb.setLength(0);
            StringBuilder beforeSi = new StringBuilder(arr.get(i - 2));
            sb.append(beforeSi);
            sb.append(1).append(reverse(invert(beforeSi)));
            arr.add(i-1, sb.toString());
        }

        return sb.charAt(k-1);
    }

    public static char findKthBit2(int n, int k) {
        if(n==1){
            return '0';
        }

            sb.setLength(0);
            StringBuilder beforeSi = new StringBuilder(arr.get(i - 2));
            sb.append(beforeSi);
            sb.append(1).append(reverse(invert(beforeSi)));
            arr.add(i-1, sb.toString());

        return sb.charAt(k-1);
    }
}
