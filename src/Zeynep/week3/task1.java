package Zeynep.week3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        boolean is = true;
        while(is){
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            reverseNegativeNumber(num);
            is =true;
        }
    }

    public static void reverseNegativeNumber(int num){
        String number = String.valueOf(num);
        char[] digit = number.toCharArray();


        String result = "";
        for (int i = number.length()-1; i > 0  ; i--) {
            result += digit[i];

        }

        int result1 = (-1) * (Integer.parseInt(result)) ;
        System.out.println( result1);

    }
}
