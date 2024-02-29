package week03;

public class PrimeNumber {


        /*
        1️⃣ Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
 Ex:
            7 -> prime, because only 1 and 7 can be divided evenly
            6 -> not prime, because 6 is divisible by 2 and 3 also

         */

        public static void main(String[] args) {
            System.out.println(isPrime(7));
            System.out.println(isPrime(6));
            System.out.println(isPrime(8));
            System.out.println(isPrime(11));
            System.out.println(isPrime(13));

            System.out.println(isPrime(1));

        }

        public static boolean isPrime(int n){

            if(n < 2){
                return false;
            }

            for(int i = 2; i < n; i++){

                if(n % i == 0){
                    return false;
                }

            }

            return true;
        }
    }









