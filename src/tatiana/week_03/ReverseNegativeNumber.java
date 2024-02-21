package tatiana.week_03;

public class ReverseNegativeNumber {
    public static int reverseNegative(int num) {
        // Check if the number is negative
        if (num >= 0) {
            throw new IllegalArgumentException("Input number must be negative.");
        }

        // Convert the number to positive for reversal
        String numStr = Integer.toString(-num);
        StringBuilder reversedStr = new StringBuilder(numStr).reverse();
        // Convert the reversed string back to int
        int reversedNum = Integer.parseInt(reversedStr.toString());
        // Make the reversed number negative again
        return -reversedNum;
    }

    public static void main(String[] args) {
        int input = -75;
        int reversed = reverseNegative(input);
        System.out.println("Reversed number: " + reversed);
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */
