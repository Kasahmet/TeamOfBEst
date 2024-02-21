package seda.week01;

public class Task1_OddAndEven {

    public static void main(String[] args) {
        System.out.println(identify(58)); // Output: Odd

    }
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

/*
Write a method that can identify  a given number is even or odd.
 */