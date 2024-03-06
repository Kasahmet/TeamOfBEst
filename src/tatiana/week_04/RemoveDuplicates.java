package tatiana.week_04;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String duplicateLetters = "AAABBBCCC";
        System.out.println(removeDup(duplicateLetters));
    }
    public static String removeDup(String str) {
        // We use a LinkedHashSet to store characters.
        // LinkedHashSet preserves the order of elements and automatically removes duplicates.
        // Use LinkedHashSet to preserve the order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // We iterate through the duplicateLetters string, adding each character to the LinkedHashSet.
        // Add each character to the set (duplicates will not be added)
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Finally, we construct the result string by iterating over the set and appending each character to a StringBuilder.
        // Construct the result string from the set
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }

}
/*
String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */
