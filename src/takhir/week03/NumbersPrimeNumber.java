package takhir.week03;

import java.util.Scanner;

public class NumbersPrimeNumber {
    public static void main(String[] args) {

        boolean flag = true;
        while(flag){
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            PrimeNumberIdentifiers(num);
            flag =true;
        }
    }

    public static void PrimeNumberIdentifiers(int num) {
        int count =0;
        for (int i = 1; i <= num ; i++) {
           if(num %i == 0 ){
               count= count+1;
           }

        }
        if(count>2){
            System.out.println("" + num +" is not a prime" );
        }else if(count==2) {
            System.out.println("" + num +" is a prime" );
        }else if(count ==1){
            System.out.println("one is not a prime");
        }





    }
}
/*
*
* Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
*
* */