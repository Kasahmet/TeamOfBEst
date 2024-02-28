package imane.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-20));
    }
    public static int reverseNegativeNumber(int num){

        String newNum = Integer.toString(num);
        String reversedStr  = "";
        boolean isNegative = false;

        if(num < 0){
            isNegative=true;
            newNum = newNum.substring(1);
        }

        for (int i = newNum.length()-1; i >= 0; i--) {
                  reversedStr += newNum.charAt(i);
        }

        int reversedNum  = Integer.parseInt(reversedStr.toString());


        if(isNegative ){
            reversedNum *= -1;
        }
     return reversedNum;
    }

}
      /* Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53*/

