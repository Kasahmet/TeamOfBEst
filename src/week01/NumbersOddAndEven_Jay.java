package week01;

public class NumbersOddAndEven_Jay {


    public static void oddOrEven(int num){

        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        oddOrEven(4);
        oddOrEven(7);
    }
}
/*
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */

