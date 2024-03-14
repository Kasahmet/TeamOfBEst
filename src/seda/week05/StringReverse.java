package seda.week05;

public class StringReverse {
    public static String reverse(String str) {
        // Initialize an empty string to store the reversed result
        String reversed = "";

        // Iterate over the characters of the input string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += str.charAt(i);
        }

        // Return the reversed string
        return reversed;
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(reverse(str)); // Output: DCBA
    }
}
