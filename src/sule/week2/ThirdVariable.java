package sule.week2;

public class ThirdVariable {
    public class Main {
        public void main(String[] args) {
            // Initial values
            int a = 10;
            int b = 20;

            // Swapping without a third variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
