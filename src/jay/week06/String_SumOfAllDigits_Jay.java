package jay.week06;

public class String_SumOfAllDigits_Jay {


    public static void main(String[] args) {

        System.out.println(sumOfAllDigits("12 java 5 apple 3"));
    }

    public static int sumOfAllDigits(String str) {
        int sum = 0;


        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {

                sum +=  Integer.valueOf(""+each);
            }
        }

        return sum;
    }}

    // how can I create this method:
        // directly referencing ASCII table
        // without using .isDigit or parseInt

    // "https://www.geeksforgeeks.org/java-program-to-convert-char-to-int/"


/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */