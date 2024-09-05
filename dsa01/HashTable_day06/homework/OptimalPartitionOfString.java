package HashTable_day06.homework;

import java.util.ArrayList;

/**
 * 2405. Optimal Partition of String
 * Medium
 * Topics
 * Companies
 * Hint
 * Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.
 *
 * Return the minimum number of substrings in such a partition.
 *
 * Note that each character should belong to exactly one substring in a partition.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abacaba"
 * Output: 4
 * Explanation:
 * Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
 * It can be shown that 4 is the minimum number of substrings needed.
 * Example 2:
 *
 * Input: s = "ssssss"
 * Output: 6
 * Explanation:
 * The only valid partition is ("s","s","s","s","s","s").
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of only English lowercase letters.
 */

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        String s = "abacab";
//         s = "ssssss";
//         s = "abacbd";
//         s = "gizfdfri";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < stringBuilder.length(); j++) {
                if(s.charAt(i) == stringBuilder.charAt(j)){
                    count++;
                    stringBuilder.setLength(0);
                    stringBuilder.append(s.charAt(i));
                    break;
                }
            }
                stringBuilder.append(s.charAt(i));
        }

        if (!stringBuilder.isEmpty()){
            count++;
        }
        return count;
    }
}
