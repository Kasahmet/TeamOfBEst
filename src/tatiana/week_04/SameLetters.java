package tatiana.week_04;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        String strNum1 = "abc";
        String strNum2 = "cab";
        System.out.println(same(strNum1, strNum2));

        strNum1 = "abc";
        strNum2 = "abb";
        System.out.println(same(strNum1, strNum2));
    }

    public static boolean same(String strNum1, String strNum2) {
        // Convert both strings into character arrays using the toCharArray() method.
        char[] charArray1 = strNum1.toCharArray();
        char[] charArray2 = strNum2.toCharArray();

        // Sort both character arrays using Arrays.sort() method.
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal using Arrays.equals() method.
        // If they are equal, it means the strings are built out of the same letters, otherwise not.
        return Arrays.equals(charArray1, charArray2);

    }
}
/*
String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */
