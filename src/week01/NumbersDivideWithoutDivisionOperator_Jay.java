package week01;

public class NumbersDivideWithoutDivisionOperator_Jay {
    public static void divide(int num1, int num2){

        int answer = 0;
        int count = 0;

        if(num1 % num2 != 0){
            System.out.println("Not evenly divisible");
        }else{
            while(count != num1) {
                count += num2;
                answer ++;
            }
        }
        System.out.println( num1 + " divided by " + num2 + " equals " + answer);
    }

    public static void main(String[] args) {

        divide(10, 5);
    }
}
/*
Write a method that can divide two numbers without using division operator.
 */

