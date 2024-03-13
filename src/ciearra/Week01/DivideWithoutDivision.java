package ciearra.Week01;

public class DivideWithoutDivision {
    public static void main(String[] args) {
        System.out.println(DivideWithoutDivisionOperator(49, 7));

    }

    public static int DivideWithoutDivisionOperator(int a, int b) {
        int count = 0;
        if (a < 0) {
            System.err.println("Sorry, We cannot use this");
        }
        if (b == 0) {
            System.err.println("You're not able to divide by zero");
        } else {

            if (b > 0) {
                while (a >= b) {
                    a -= b;
                    count++;
                }
            } else {
                while (a > 0) {
                    a += b;
                    count--;
                }
            }

        }
        return count;
    }
}
