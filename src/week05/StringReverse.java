package week05;

public class StringReverse {
    public static void main(String[] args) {
        String input = "ABCD";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

}
/*


  String -- Reverse
Write a function that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA *
 */