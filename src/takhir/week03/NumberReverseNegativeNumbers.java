package takhir.week03;

import java.util.Scanner;

public class NumberReverseNegativeNumbers {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            reverseNegNumber(num);
            flag =true;
        }
    }

    public static void reverseNegNumber(int num){
       String number = String.valueOf(num);
       char[] digits = number.toCharArray();


        String result = "";
        for (int i = number.length()-1; i > 0  ; i--) {  // i>0 because i dont need - sign
           result += digits[i];

        }

        int res = (-1) * (Integer.parseInt(result)) ;  //convert to integer
        System.out.println( res);

    }
}
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
* */