package tatiana.week_01;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(identify(5)); // Output: "Odd"
        System.out.println(identify(6)); // Output: "Even"
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
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */
