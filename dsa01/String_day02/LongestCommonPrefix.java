package String_day02;

/**
 * Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
//        String[] strs = {"",""};
//        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

//    public static String longestCommonPrefix(String[] strs) {
//        String output=strs[0];
//        for(int i=1;i<strs.length;i++){
//            while(strs[i].indexOf(output)!=0){
//                output=output.substring(0,output.length()-1);
//            }
//            if (output.isEmpty()){
//                return "";
//            }
//
//        }
//        return output;
//    }

    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];

        for (int i = 0; i < strs.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if(strs[j].indexOf(result) != 0){
                    result = result.substring(0, result.length()-1);
                }
                if(result.isEmpty()){
                    return "";
                }
            }
        }
        return result;
    }


}
