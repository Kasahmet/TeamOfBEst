package Jay.week02;

import java.util.Scanner;

public class SwapNumbers_Jay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input num1");
        int num1 = scan.nextInt();
        System.out.println("Input num2");
        int num2 = scan.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 -num2;

        System.out.println("num1 now equals " + num1);
        System.out.println("num2 now equals " + num2);


    }

}
