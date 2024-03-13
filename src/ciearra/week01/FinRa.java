package ciearra.week01;

public class FinRa {
    public static void main(String[] args) {
        FINRA();
    }
    public static void FINRA() {
        for(int i = 1; i <= 30; i++){
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }

    }
}
