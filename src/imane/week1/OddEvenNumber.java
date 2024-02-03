package imane.week1;

public class OddEvenNumber {

    public static  int oddEvenNumber (int num) {

        if (num % 2 == 0) {
            System.out.println("This number " + num + " is even");
        } else {
            System.out.println("This number " + num + " is odd");

        }
         return num;
    }

    public static void main(String[] args) {

        System.out.println(oddEvenNumber(33));

    }


     }
/* Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"*/