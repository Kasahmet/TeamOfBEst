package takhir.week05;

public class ReverseString {
    public static void main(String[] args) {
        String word ="ABCD";
        reversMethod(word);
    }

    public static void reversMethod(String word){
         char[] charWord = word.toCharArray();
         String res = new String();
        for (int i = charWord.length - 1;     i >= 0;    i--) {

            res+= String.valueOf(charWord[i]);

        }
        System.out.println(res);
    }
}

/*
⃣  String -- Reverse
Write a function that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA *
* */