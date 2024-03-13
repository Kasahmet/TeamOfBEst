package imane.week5;

public class UniqueCharactersFromString {

    //Write a return method that can find the unique characters from the String
    public static String unique(String str) {

        String unique = ""; //declaring variable with temporary empty value, to store final result

        for (int i = 0; i < str.length(); i++) { // i - index number of given string
            // loop will iterate through index numbers of string
            char each = str.charAt(i); // to get every single characters of string I will use charAt() method and store them into each;

            if (str.indexOf(each) == str.lastIndexOf(each)) { //if the first time character occurred equals last time character occurred
                unique += each; //add character to unique
            }
        }
        return unique;
    }


    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));
    }

}
