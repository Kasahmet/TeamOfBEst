package sule.week2;

public class Divisible {
    public static class Main {
        public static void main(String[] args) {

            for (int i = 1; i <= 100; i++) {
                if (i % 15 == 0) {
                    System.out.println(i + " - Divisible by 15");
                } else if (i % 3 == 0) {
                    System.out.println(i + " - Divisible by 3");
                } else if (i % 5 == 0) {
                    System.out.println(i + " - Divisible by 5");
                }
            }
        }
    }
}
