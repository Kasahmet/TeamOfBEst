package imane.week4;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(havingTheSameLetters("adam", "mada"));
    }


   public static boolean havingTheSameLetters(String str1,String str2){

       if(str1.length()!=str2.length())
        return false;

       for (int i = 0; i < str1.length(); i++) {
           char character = str1.charAt(i);

           boolean isSameLetter = false;
           for (int j = 0; j < str2.length() ; j++) {
               if(character ==str2.charAt(j)){
                   isSameLetter = true;
               }
           }
           }
          return true;
       }

       }




/*
2️⃣  String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false*/