package seda.week02;

public class NumberReplacement {
    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        printNumbers(24);
    }
}
/*
write a function:
that ,given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. however, any number divisible by 2,3 or 5 should be replaced by the word Codility,Test or Coders respectively. if a number is divisible by more than on of the numbers :2,3 or 5, it should be replaced by a concatenation of the respective words Codolity,Test and Coders in this given order. for example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5 ,should be replaced by CodilityTestCoders
 */