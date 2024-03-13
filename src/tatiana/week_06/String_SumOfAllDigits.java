package tatiana.week_06;

public class String_SumOfAllDigits {
    /*
    This line defines a method named sumOfDigits which takes a single parameter input of type String.
    This method will calculate the sum of digits in the provided string and return it as an integer.
     */
    public static int sumOfDigits(String input) {
        /*
        This line splits the input string input using the split() method.
        The \\D+ regular expression pattern is used to split the string at one or more non-digit characters.
        This results in an array parts containing substrings of the input string that consist of only digits.
         */
        String[] parts = input.split("\\D+");

        /*
        This line initializes an integer variable sum to 0.
        This variable will store the total sum of digits found in the string.
         */
        int sum = 0;

        /*
        This line starts a for-each loop that iterates over each element part in the parts array.
        Each part represents a substring containing only digits extracted from the input string.
         */
        for (String part : parts) {

            /*
            This line checks if the current substring part is not empty.
            This is done to ensure that the substring contains at least one digit before attempting to parse it as an integer.
             */
            if (!part.isEmpty()) {

                /*
                This line converts the current substring part to an integer using Integer.parseInt() and adds it to the sum variable.
                This operation effectively accumulates the sum of all digits found in the input string.
                 */
                sum += Integer.parseInt(part);
            }
        }

        /*
        This line returns the final sum of digits calculated from the input string.
         */
        return sum;
    }

    public static void main(String[] args) {
        String myString = "Today 13 March 2024 and I need to solve 3 weekly tasks";

        /*
        This line calls the sumOfDigits method with the input string as argument,
        and assigns the returned sum to the variable sum.
         */
        int sum = sumOfDigits(myString);
        System.out.println("Sum of digits in the string: " + sum);
    }
}
/*
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
 */
