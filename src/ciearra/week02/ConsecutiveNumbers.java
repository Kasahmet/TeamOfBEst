package ciearra.week02;

public class ConsecutiveNumbers {
    public static void consecutiveNumber(int N){
        for (int i = 1; i <= N ; i++) {
            if(i%2 == 0 || i%3 == 0 || i%5 == 0){
                if(i%2 == 0) {
                    System.out.print("Codility");
                }
                if(i%3 == 0){
                    System.out.print("Test");
                }
                if(i%5 == 0) {
                    System.out.print("Coders");
                }
                System.out.println();

            }  else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        consecutiveNumber(10);
    }

}

