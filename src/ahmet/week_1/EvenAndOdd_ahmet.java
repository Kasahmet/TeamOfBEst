package ahmet.week_1;

import java.util.Scanner;

public class EvenAndOdd_ahmet {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        String data= "Please write number";

        System.out.println(data);

        int num= input.nextInt();


        oddOrEven(num);




    }


    public static int oddOrEven(int num){

        int remainder= num%2;

        if (remainder==0){
            System.out.println("Even Number");


        }else {
            System.out.println("Odd number");
        }


        return num ;

    }
}


