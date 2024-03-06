package tatiana.week_05;

// This line starts the definition of a class named StringFindUnique.
public class StringFindUnique {

    // This line defines the main method, which serves as the entry point of the program.
    public static void main(String[] args) {

        // This line declares a String variable named str and initializes it with the value "TTTTAAAAAATIAAANAAAA".
        String str = "TTTTAAAAAATIAAANAAAA";

        // This line declares a String variable named unique and initializes it with an empty string.
        // This variable will hold the unique characters found in the string str.
        String unique = "";

        // This line starts a loop that iterates over the characters of the string str.
        // The loop variable i represents the index of each character in the string.
        for (int i = 0; i < str.length(); i++) { // i: index numbers of str

            // This line retrieves the character at the current index i from the string str and stores it in a char variable named each.
            char each = str.charAt(i);

            // This line checks if the first occurrence index and the last occurrence index of the character each in the string str are the same.
            // This condition ensures that the character each occurs only once in the string.
            if(str.indexOf(each) == str.lastIndexOf(each)){

                //If the condition is true (i.e., the character is unique), this line appends the character each to the unique string.
                unique += each;
            }
        }

        // Finally, this line prints out the unique string, which contains all the unique characters found in the original string str.
        System.out.println(unique);
    }
}
/*
String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
