package week06;

public class SumOfAllDigits {
    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        System.out.println(sumOfAllDigits(input));
    }

    public static int sumOfAllDigits(String input) {
        int sum = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNumber.append(c);
            } else {
                if (currentNumber.length() > 0) {
                    sum += Integer.parseInt(currentNumber.toString());
                    currentNumber.setLength(0);
                }
            }
        }

        if (currentNumber.length() > 0) {
            sum += Integer.parseInt(currentNumber.toString());
        }

        return sum;
    }
}
/*
 String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */