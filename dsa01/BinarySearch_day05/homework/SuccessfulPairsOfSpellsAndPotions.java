package BinarySearch_day05.homework;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
//        int[] spells = {3,1,2};
//        int[] potions = {8,5,8};
        long success = 7;
        System.out.println(Arrays.toString(successfulPairs(spells, potions, success)));
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] result = new int[n];

        // sort potions array
        Arrays.sort(potions);

        int start = -1;
        int idxSpell = 0;
        int leftPotion = 0;
        int rightPotion = m-1;

        while(leftPotion <= rightPotion && idxSpell < n){
            int mid = leftPotion + (rightPotion - leftPotion)/2;
            long successElement = (long) potions[mid] * spells[idxSpell];

            if (successElement >= success){
                start = mid;
                rightPotion = mid - 1;
            }else{
                leftPotion = mid + 1;
            }

            if (leftPotion > rightPotion){
                if (start == -1) start = m;
                result[idxSpell] = m-start;
                leftPotion = 0;
                rightPotion = m-1;
                idxSpell++;
                start = -1;
            }
        }

        return result;
    }
}
