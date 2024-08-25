package day04.sort;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,1,6,8,3);
        System.out.println(bubbleSort(list));
    }

    public static List<Integer> bubbleSort(List<Integer> list){
        int n = list.size();
        int temp;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j+1)){
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

        return list;
    }
}
