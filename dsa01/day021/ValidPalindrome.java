package day021;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        StringBuilder result = new StringBuilder();
        //remove space & non-alphanumeric
        for (int i = 0; i < s.length(); i++) {
            char currentCharacter = s.charAt(i);
            String letter = String.valueOf(currentCharacter);
            if(Character.isLetterOrDigit(currentCharacter)){
                result.append(letter.toLowerCase());
            }
        }

        int j = result.length() - 1;

        for (int i = 0; i < result.length(); i++) {
            if(result.charAt(i) != result.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }
}
