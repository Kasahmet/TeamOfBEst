package tatiana.week_05;

// This line starts the definition of a class named StringReverse.
public class StringReverse {

    //This line defines the main method, which serves as the entry point of the program.
    public static void main(String[] args) {

        // This line declares a String variable named str and initializes it with the value "TATIANA".
        String str = "TATIANA";

        // This line declares another String variable named reverse and initializes it with an empty string.
        // This variable will hold the reversed version of the original string str.
        String reversed = "";

        // This line starts a loop that iterates over the characters of the string str in reverse order.
        // The loop variable i starts from the index of the last character of str and decrements until it reaches 0.
        for (int i = str.length() - 1; i >= 0; i--){

            //Inside the loop, this line appends each character of str at index i to the reverse string.
            // As the loop progresses, characters from str are appended to reverse in reverse order, effectively reversing the string.
            reversed += str.charAt(i);
        }

        // Finally, this line prints out the reverse string, which contains the reversed version of the original string str.
        System.out.println(reversed);
    }
}
/*
String -- Reverse
Write a function that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA *
 */
