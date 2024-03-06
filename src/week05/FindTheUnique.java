package week05;

public class FindTheUnique {
    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String uniqueCharacters = findUniqueCharacters(input);
        System.out.println(uniqueCharacters);
    }

    public static String findUniqueCharacters(String input) {
        StringBuilder uniqueChars = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString();
    }
}
/*
 String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */