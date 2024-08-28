package Recursion_day03.homework;

public class Base7 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }
    public static String convertToBase7(int num) {
        int sign = 1;
        if (num == 0) return "";
        if (num < 0){
            sign = -1;
            num = num*(-1);
        }
        int rmd;
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            rmd = num % 7;
            num = num / 7;
            sb.append(rmd);
        }



        return sign == 1 ? sb.reverse().toString() : sb.reverse().insert(0, '-').toString();
    }
}
