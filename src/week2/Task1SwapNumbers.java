package week2;

public class Task1SwapNumbers {
    public static void main(String[] args) {
        int a = 25;
        int b = 35;
        a = a ^ b; // a becomes bitwise XOR of its value and b
        b = a ^ b; // b becomes bitwise XOR of a (which now contains XOR of a and b) and b,
        // making b hold original value of a
        a = a ^ b; // a becomes bitwise XOR  of its current value(which contains original value of b) and b,
        // making a hold the original value of b

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("===================");

        //solution2

        int c = 10;
        int d = 20;

        c = c + d;  // c now holds the sum of both values
        d = c - d;  // d now holds the original value of a
        c = c - d;  // c now holds the original value of d

        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
//Swap without using third variable
// ^ XOR exclusive OR
