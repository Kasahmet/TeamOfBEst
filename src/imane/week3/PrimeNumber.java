package imane.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrimeNumber());

    }


    public static boolean isPrimeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = input.nextInt();

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
                return true ;

    }
}
        /*
1️⃣ Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
         */





