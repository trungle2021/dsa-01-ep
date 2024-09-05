package HashTable_day06.homework;

import java.util.HashMap;

/**
 * 771. Jewels and Stones
 * Easy
 * Topics
 * Companies
 * Hint
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 *
 *
 * Example 1:
 *
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 * Example 2:
 *
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 */

public class JewelsAndStones {
    public static void main(String[] args) {
//       String jewels = "z", stones = "ZZ";
       String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int sum = 0;
        HashMap<Character,Integer> hashmap = new HashMap();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)){
                    hashmap.put(jewels.charAt(i), hashmap.getOrDefault(jewels.charAt(i), 0) + 1);
                }
            }
        }


        for(char jewel: hashmap.keySet()){
            sum+=hashmap.get(jewel);
        }

        return sum;
    }
}
