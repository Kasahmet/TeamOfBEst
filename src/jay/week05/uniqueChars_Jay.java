package jay.week05;

public class uniqueChars_Jay {

    public static void main(String[] args) {

        System.out.println(returnUniqueChars("aabbcc"));
        System.out.println(returnUniqueChars("abcc"));
    }

    public static String returnUniqueChars(String str){

        String finalString = ""; // aybba
        int count;

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }
            if(count == 1){
                finalString += str.charAt(i);
            }
        }

        return finalString;
}}
/*
 String - Find the unique
Write a return method that can find the unique characters from the String
 Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */