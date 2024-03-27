package Zeynep.week3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        boolean is = true;
        while(is){
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            PrimeNumberIdentify(number);
            is =true;
        }
    }

    public static void PrimeNumberIdentify(int number) {
        int count =0;
        for (int i = 1; i <= number ; i++) {
            if(number %i == 0 ){
                count= count+1;
            }

        }
        if(count>2){
            System.out.println("" + number +" is not prime" );
        }else if(count==2) {
            System.out.println("" + number +" is prime" );
        }else if(count ==1){
            System.out.println("it is not prime");
        }





    }
}
