package Jay.week03;

import java.util.Scanner;

public class primeNumber_Jay {

    // working definition of a prime number: a number that is divisible by itself and one, and not divisible by any other numbers *contained in it*

    public static boolean isPrime(int num){

        boolean isPrime = false;

        // set count to 0
        int count = 0;

        // loop num times
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) { //if num divides evenly with number,
                count += 1; // add one to count.
            }

            // count now contains the amount of evenly divisible numbers within the set of numbers amounting to num.
        }

        if(count == 2){ // if count equals 2,
            isPrime = true; // num is prime.
        }

        return isPrime;
}

    public static void main(String[] args) {

        System.out.println( isPrime(4));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));


    }

}


/*
Numbers -- PrimeNumber
Write a method that can check if a number is prime or not


            // 3
            // loop 3 times
            // does 1 divide 3? yes
            // does 2 divide 3? no
            // does 3 divide 3? yes
            // count equals 2. 3 is prime.

 */