package eve.week3;

public class Task1_PrimeNumber_Eve {

    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(primeNumber(5));
    }
}
