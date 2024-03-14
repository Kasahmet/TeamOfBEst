package imane.week6;

public class SumOfDigitNumber {

    public static int sumOfDigits(String string ){

         int sum = 0;

        for (int i = 0; i < string.length() ; i++) {
            char c = string.charAt(i);

            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("I take 2 pills 3 times a day"));
    }

}
