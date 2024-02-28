package week03;

public class ReverseNegativeNumber {


        public static void main(String[] args) {
            System.out.println(reverseInt(-20));

        }

        public static int reverseInt(int n){

            int rev = 0;

            while(n < 0){
                int lastDigit = n % 10;
                rev = rev * 10 + lastDigit;
                n /= 10;
            }
            return rev;
        }
    }
        /*
        2️⃣ Numbers -- Reverse Negative Number
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
         */


