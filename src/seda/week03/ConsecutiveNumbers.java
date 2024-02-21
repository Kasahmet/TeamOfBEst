package seda.week03;

public class ConsecutiveNumbers {

    public static class PrimeChecker {
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int numberToCheck = 17; // Change this to the number you want to check
            if (isPrime(numberToCheck)) {
                System.out.println(numberToCheck + " is a prime number.");
            } else {
                System.out.println(numberToCheck + " is not a prime number.");
            }
        }
    }

}