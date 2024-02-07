package takhir.week02;

import java.util.Scanner;

public class Divisible3_5_15 {
    public static void main(String[] args) {

            String resultAll= "";
            String res3 = "";
            String res5 = "";
            String resNotDivNumbers = "";
            boolean flag = true;    // true we need to keep run the Scanner, to get numbers in input

            while (flag){
                Scanner input = new Scanner(System.in);
                System.out.println("Give number from 1-100");
                int number =  input.nextInt();


                if(number % 15 ==0  && number% 5 ==0 && number% 3 ==0){
                resultAll += number + " : ";
                flag =true;
                System.out.println("Divisible by 15,5,3 -> " + resultAll );
                }else if(number % 15 !=0  && number% 3 ==0){    //15,15,15,30
                    res3 += number+ " : ";
                    flag = true;
                    System.out.println("Divisible by 3 not 15-> " + res3 );
                }
                else if(number % 15 !=0  && number% 5 ==0) {     //3,12,
                    res5 += number + " : ";
                    flag = true;
                    System.out.println("Divisible by 5 not 15-> " + res5);
                }else{                                         //7,13,16
                    resNotDivNumbers += number + " : ";
                    flag = true;
                    System.out.println("Those nums NOT div by 15,5,3-> " + resNotDivNumbers);
                }
            }








    }
}
