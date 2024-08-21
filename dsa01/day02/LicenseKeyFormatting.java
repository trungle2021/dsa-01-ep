package day02;

import java.util.Locale;

/**
 * License Key Formatting
 * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
 *
 * We want to reformat the string s such that each group contains exactly k characters, except for the first group,
 * which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
 *
 * Return the reformatted license key.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "5F3Z-2e-9-w", k = 4
 * Output: "5F3Z-2E9W"
 * Explanation: The string s has been split into two parts, each part has 4 characters.
 * Note that the two extra dashes are not needed and can be removed.
 * Example 2:
 *
 * Input: s = "2-5g-3-J", k = 2
 * Output: "2-5G-3J"
 * Explanation: The string s has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of English letters, digits, and dashes '-'.
 * 1 <= k <= 104
 */
public class LicenseKeyFormatting {
    public static void main(String[] args) {
//        String s = "5F3-2egg-9wgg-e-112-dws";
//        String s = "2-5g-3-J";
        String s = "---";
        int k = 3;
        System.out.println(licenseKeyFormatting(s,k));
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder output = new StringBuilder();
        //remove dashes
        String noDashes = s.replace("-","").toUpperCase();
        int n = noDashes.length();

        if(n == 0) return "";

        int numEleFirstGroup = n % k;

        if ( n % k == 0){
            numEleFirstGroup = k;
        }


        String firstGroup = noDashes.substring(0, numEleFirstGroup);
        output.append(firstGroup);

        for (int i = firstGroup.length(); i < noDashes.length(); i+=k) {
            output.append("-").append(noDashes, i, i+k);
        }

        return output.toString();
    }
}
