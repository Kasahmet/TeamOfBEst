package jay.week05;

public class reverseString_Jay {

    public static void main(String[] args) {

        String str = "abc";
        String str2 = "";

        for (int i = str.length()-1; i >= 0; i--) {

            System.out.print(str.charAt(i));

        }
    }
}
/*
Write a function that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA *
 */