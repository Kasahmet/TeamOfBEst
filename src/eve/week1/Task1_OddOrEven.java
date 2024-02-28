package eve.week1;

public class Task1_OddOrEven {

    /*
    Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"

     */
    public  static  String  identifyOddEven( int  n ) {
        return  n%2==0 ? "Even" : "Odd" ;


    }

    public static void main(String[] args) {
       String result = identifyOddEven(5);
        System.out.println(result);
    }
}