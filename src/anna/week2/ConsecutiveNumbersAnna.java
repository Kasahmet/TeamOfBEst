package anna.week2;

import java.util.Scanner;

public class ConsecutiveNumbersAnna {
    public static void main(String[] args) {
        System.out.println("Please, enter a whole positive number");
        int number = new Scanner(System.in).nextInt();
        ConsecutiveNumbers(number);
    }

    public static void ConsecutiveNumbers (int n){

        for (int i = 1; i <= n ; i++) {
            String s = "";

            if ( i % 2 == 0){
                s +="Codility";
            }
            if ( i % 3 == 0) {
                s += "Test";
            }
            if (i % 5 == 0) {
                s += "Coders";
            }
if(s.isEmpty()){
    System.out.println(i);
}else{
    System.out.println(s);
}





        }
    }
}
