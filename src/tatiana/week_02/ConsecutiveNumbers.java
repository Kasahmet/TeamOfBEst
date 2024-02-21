package tatiana.week_02;

public class ConsecutiveNumbers {
    public static void printConsecutiveNumber(int N){

        for (int i = 1; i <= N ; i++) {    //iterate from 1 to num

            if(i%2 == 0 || i%3 == 0 || i%5 == 0){ // if num can divisible by 2 or 3 or 5

                if(i%2 == 0){
                    System.out.print("Codility");
                }
                if(i%3 == 0){
                    System.out.print("Test");
                }
                if(i%5 == 0){
                    System.out.print("Coders");
                }
                System.out.println(); // after checked all condition print next line

            }  else {
                System.out.println(i);   // the number is not divisible by 2,3 and 5
            }

        }
    }

    public static void main(String[] args) {
        printConsecutiveNumber(20);
    }
}
