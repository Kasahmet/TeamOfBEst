package tatiana.week_01;

public class OddEven {
    public static void main(String[] args) {
        int num = 31;
        if(num % 2 == 0){
            System.out.println("This is an even number: " + num);
        }else{
            System.out.println("This is an odd number: " + num);
        }
    }
}
/*
Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
*/
