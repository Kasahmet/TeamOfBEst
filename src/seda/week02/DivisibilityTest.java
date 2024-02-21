package seda.week02;

public class DivisibilityTest {
    public static void main(String[] args) {
        System.out.println("Divisible By 15:");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible By 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDivisible By 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
write a program that can print numbers between 1-100 that can be divisible by 3,5 and 15
if the number is divisible by 3,5 and 15 ,then it should be displayed in the DivisibleBy15' section
if the number is divisible by 3 but cannot be divisible by 15 then it should be only displayed in divisibleBy3' section
if the number is divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section
 */
