package BinarySearch_day05;

import java.util.stream.IntStream;

/**
 * 374. Guess Number Higher or Lower
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * <p>
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * Return the number that I picked.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 10, pick = 6
 * Output: 6
 * Example 2:
 * <p>
 * Input: n = 1, pick = 1
 * Output: 1
 * Example 3:
 * <p>
 * Input: n = 2, pick = 1
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 231 - 1
 * 1 <= pick <= n
 */

public class GuessNumber {
    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */

    public static void main(String[] args) {
        int picked = 6, n = 10;
        System.out.println(guessNumber(n, picked));
    }

    public static int guessNumber(int n, int picked) {
        int low = 1;
        int high = n;

        while (low <= high){
            int mid = low + (high - low)/2;
            int p = guess(picked, mid);
            if (p == 0) {
                return mid;
            }else if (p == 1){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int guess(int picked, int num) {
        if (num > picked){
            return -1;
        }else if (num < picked){
            return 1;
        }
        return 0;
    }
}
