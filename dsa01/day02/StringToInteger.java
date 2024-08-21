package day02;

import java.math.BigInteger;

import static java.lang.Integer.parseInt;

/**
 * String to Integer (atoi)
 *
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 *
 * The algorithm for myAtoi(string s) is as follows:
 *
 * Whitespace: Ignore any leading whitespace (" ").
 * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity is neither present.
 * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
 * Return the integer as the final result.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "42"
 *
 * Output: 42
 *
 * Explanation:
 *
 * The underlined characters are what is read in and the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "42" ("42" is read in)
 *            ^
 * Example 2:
 *
 * Input: s = " -042"
 *
 * Output: -42
 *
 * Explanation:
 *
 * Step 1: "   -042" (leading whitespace is read and ignored)
 *             ^
 * Step 2: "   -042" ('-' is read, so the result should be negative)
 *              ^
 * Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
 *                ^
 * Example 3:
 *
 * Input: s = "1337c0d3"
 *
 * Output: 1337
 *
 * Explanation:
 *
 * Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
 *              ^
 * Example 4:
 *
 * Input: s = "0-1"
 *
 * Output: 0
 *
 * Explanation:
 *
 * Step 1: "0-1" (no characters read because there is no leading whitespace)
 *          ^
 * Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
 *          ^
 * Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
 *           ^
 * Example 5:
 *
 * Input: s = "words and 987"
 *
 * Output: 0
 *
 * Explanation:
 *
 * Reading stops at the first non-digit character 'w'.
 *
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 200
 * s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */

public class StringToInteger {
    public static void main(String[] args) {
//        String s = " -042";
//        String s = "1337c0d3";
//        String s = "0-1";
//        String s = "+-12342";
//        String s = "-+12";
//        String s = "+-12";
//        String s = " ";
        String s = "12568";
//        String s = "20000000000000000000";
//        String s = "words and 987";
//        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s){
        long number = 0;
        int sign = 1;
        int i = 0;
        while(i<s.length() && s.charAt(i) == ' ') i++;

        if(i<s.length() && (s.charAt(i)== '-' || s.charAt(i)== '+')){
            sign = s.charAt(i)== '-'?-1:1;
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            number = number*10 + Integer.parseInt(String.valueOf(s.charAt(i)));
            if(sign*number<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign*number>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) number*sign;
    }

//    public static int myAtoi(String s) {
//        String removedSpace = s.strip();
//        int sign = 1;
//        int index = 0;
//        StringBuilder sb = new StringBuilder();
//
//        if(removedSpace.length() == 0) return 0;
//
//        if(removedSpace.charAt(0) == '-'){
//            sign = -1;
//            index++;
//        }else if(removedSpace.charAt(0) == '+'){
//            index++;
//        }
//
//        while(index < removedSpace.length() && removedSpace.charAt(index) == '0'){
//            index++;
//        }
//
//        for (int i = index; i < removedSpace.length(); i++) {
//            char c = removedSpace.charAt(i);
//
//            if (c == 0){
//                continue;
//            }
//
//            if(!Character.isDigit(c)){
//                break;
//            }
//
//            sb.append(c);
//        }
//
//        if(!sb.isEmpty()) {
//            try{
//                int result = sign*Integer.parseInt((sb.toString()));
//                return result;
//            }catch (NumberFormatException e){
//                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
//            }
//        }
//
//        return 0;
//    }

//    public
}
