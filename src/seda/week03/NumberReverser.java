package seda.week03;

public class NumberReverser {
    public static int reverseNumber(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return isNegative ? -reversedNumber : reversedNumber;
    }

    public static void main(String[] args) {
        int inputNumber = -35; // Change this to the number you want to reverse
        int reversedNumber = reverseNumber(inputNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
