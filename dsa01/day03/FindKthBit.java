package day03;

/**
 * 1545. Find Kth Bit in Nth Binary String
 * Medium
 * <p>
 * Topics
 * Companies
 * <p>
 * Hint
 * Given two positive integers n and k, the binary string Sn is formed as follows:
 * <p>
 * S1 = "0"
 * Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1
 * Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).
 * <p>
 * For example, the first four strings in the above sequence are:
 * <p>
 * S1 = "0"
 * S2 = "011"
 * S3 = "0111001"
 * S4 = "011100110110001"
 * S4 = "011100110110001"
 * Return the kth bit in Sn. It is guaranteed that k is valid for the given n.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3, k = 1
 * Output: "0"
 * Explanation: S3 is "0111001".
 * The 1st bit is "0".
 * Example 2:
 * <p>
 * Input: n = 4, k = 11
 * Output: "1"
 * Explanation: S4 is "011100110110001".
 * The 11th bit is "1".
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 20
 * 1 <= k <= 2n - 1
 */

public class FindKthBit {
    public static void main(String[] args) {
        int n = 4, k = 3;
        System.out.println(findKthBit(n, k));
    }

//    public static String reverse(String strs) {
//        return new StringBuilder(strs).reverse().toString();
//    }
//
//    public static String invert(String strs) {
//        StringBuilder sb = new StringBuilder();
//        for (char c : strs.toCharArray()) {
//            if (c == '0') {
//                sb.append('1');
//            } else {
//                sb.append('0');
//            }
//        }
//        return sb.toString();
//    }
//
//        public static String formString (String strs){
//            StringBuilder sb = new StringBuilder(strs);
//            return sb.append(1).append(reverse(invert(strs))).toString();
//        }
//
//        public static char findKthBit ( int n, int k){
//            String[] arr = new String[n];
//            arr[0] = "0";
//
//            for (int i = 1; i < n; i++) {
//                arr[i] = formString(arr[i-1]);
//            }
//
//            return arr[n-1].charAt(k-1);
//        }

    public static char findKthBit(int n, int k) {
        /**
         Input: n = 4, k = 11
         Output: "1"
         Explanation: S4 is "011100110110001".
         The 11th bit is "1".
         */
        if (n == 1) return '0';
        int length = (1 << n) - 1, mid = length / 2 + 1;
        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);
        char temp = findKthBit(n - 1, length - k + 1);
        return temp == '0' ? '1' : '0';
    }
}
