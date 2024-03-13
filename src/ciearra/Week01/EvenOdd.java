package ciearra.Week01;

public class EvenOdd {
    public static void main(String[] args) {
        evenOdd(1);
        evenOdd(6);
    }
    public static void evenOdd (int num){
        if(num % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
