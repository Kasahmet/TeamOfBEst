package eve.week6;

public class Task3_SumOfDigits_Eve {

    public static void main(String[] args) {
        String input = "Hello123World456";
        int sum = sumDigits(input);

        System.out.println("Sum of digits in the string: " + sum);
    }

    public static int sumDigits(String str) {
        int sum = 0;

        // Iterate over each character in the string
        for (char each : str.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(each)) {
                // Add the digit to the sum
                sum +=  Integer.valueOf(""+each);
// sum += Character.getNumericValue(each);
            }
        }

        return sum;
    }



}
