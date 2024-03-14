package imane.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseString {
      /*
    String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse1(String str){
        String reverse = "";//declare an empty String
        for(int i = str.length()-1; i >= 0; i--){//use reverse for loop
            reverse+=str.charAt(i);//concatenate each character to an empty string
        }
        return reverse;//return new string
    }

    public static String reverse2(String str){
        char [] allCharacters = str.toCharArray();//convert String into Array of char

        ArrayList<Character> listOfChar = new ArrayList<>();//create ArrayList of Characters object

        for (char eachChar : allCharacters) {//loop through each element of char Array and add each to the ArrayList
            listOfChar.add(eachChar);
        }
        Collections.reverse(listOfChar);//use reverse() method of Collections
        String reverse = "";//create empty String
        for (Character character : listOfChar) {//use for loop to add each character to new string
            reverse+=character;
        }


        return reverse;
    }



    public static String reverse3(String str){
        StringBuffer stb = new StringBuffer(str);//create a StringBuffer object

        stb = stb.reverse();//use StringBuffer reverse() method

        return stb.toString();//convert StringBuffer into String and return it
    }

    public static String reverse4(String str){
        String [] strArray = str.split("");//splitting string into string array
        //int beg --> indexes from beginning till end
        //int end --> indexes from end to beginning
        for(int beg = 0, end = strArray.length-1; beg< strArray.length/2; beg++, end --){
            String temp = strArray[beg];//temporary variable to store first char
            strArray[beg] = strArray[end];//swapping
            strArray[end] = temp;//placing first character into last index
        }
        return String.join("", strArray);
    }

    public static String reverse5(String str){

        char [] charArray = str.toCharArray();//create char array using tiCharArray() method

        for(int i = 0, j=charArray.length-1; i<charArray.length/2; i++, j--){//for loop with 2 variables i--> beginning indexes and j--> ending indexes
            char temp = charArray[i];//temporary variable to store the first character
            charArray[i]=charArray[j];//swapping
            charArray[j]=temp;//placing first character into last index
        }
        return new String(charArray);//returning new string object with charArray argument in constructor
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create Scanner object
        System.out.println("Enter a String");
        String str = input.nextLine();//input a String

        System.out.println("Reverse with for loop "+reverse1(str));//print reversed string
        System.out.println("Reverse with Collections " + reverse2(str));

        System.out.println("Reverse with StringBuffer " + reverse3(str));

        System.out.println("Reverse with Array "+reverse4(str));

        System.out.println("Reverse with Array2 "+reverse5(str));
    }
}
