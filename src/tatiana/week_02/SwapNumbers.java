package tatiana.week_02;

public class SwapNumbers {
    public static void main(String[] args) {
        // Swap two variable' values without using a third variable
        int a = 40;
        int b = 22;

        System.out.println("a = " + a); // a = 40
        System.out.println("b = " + b); // b = 22

        a += b;
        b = a-b;
        a -= b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
