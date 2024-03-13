package jay.week03;

public class reverseNumber_Jay {

    public static int reverseInt(int num){


        int rev = 0;

        while (num > 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        System.out.println(reverseInt(1234));
    }


}
/*
Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */