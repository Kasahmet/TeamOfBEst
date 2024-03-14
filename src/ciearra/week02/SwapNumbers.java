package ciearra.week02;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 400;
        int num2 = 3;

        System.out.println("Original numbers: num1 = " + num1 + " & num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println("After swapping the numbers the results are as follows: num1 = " + num1 + " & num2 = " + num2);


    }
}