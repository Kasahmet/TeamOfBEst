package jay.week04;

import java.util.*;

public class sameLetters_Jay {
    public static void main(String[] args) {

        System.out.println(same("aabc", "abc"));
    }

    public static boolean same(String str1, String str2){

        SortedSet<Character> set1 = new TreeSet<>(); //abc
        SortedSet<Character> set2 = new TreeSet<>(); //bca

        for(int i = 0; i < str1.length(); i++){
            set1.add((str1.charAt(i)));
        }

        for(int i = 0; i < str2.length(); i++){
            set2.add((str2.charAt(i)));
        }

        if(set1.equals(set2)){
            return true;
        }else{
            return false;
        }
    }

}
/*
String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */