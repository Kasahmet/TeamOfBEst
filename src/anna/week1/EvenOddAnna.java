package anna.week1;

public class EvenOddAnna {

    public static void main(String[] args) {
        EvenOdd(5);
        EvenOdd(6);
    }

    public static void EvenOdd (int number){
        if (number % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }

}
