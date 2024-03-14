package takhir.week06;

public class SumOfAllDigitsInString {
    public static void main(String[] args) {
        System.out.println(
                string_SumOfAllDigits("12 java 5 apple 3")
        );
    }

    public static int string_SumOfAllDigits(String text){
        String[] each = text.split(" ");
        int result =0;
        for (String eachElement : each) {
            try{
                int number = Integer.parseInt(eachElement);
                result+=number;
            }catch (  NumberFormatException e       ){
            }
        }
        return result;
    }


}





/*
String_SumOfAllDigits
Write a method that can return the sum of the digits in a String
Ex:  "12 java 5 apple 3"  ==>  20
* */