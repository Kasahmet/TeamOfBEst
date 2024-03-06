package tatiana.week_04;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(frequencyOfChars(input));
    }

    public static String frequencyOfChars(String str) {
        // Create a HashMap to store characters and their frequencies
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through each character in the str string
        // Loop through the string and update the frequency map
        for (char eachChar : str.toCharArray()) {
            // Update the count for the current character
            charCountMap.put(eachChar, charCountMap.getOrDefault(eachChar, 0) + 1);
        }

        // Construct the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}
/*
String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
