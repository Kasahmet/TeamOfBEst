package takhir.week02;

import java.util.Scanner;

public class ConsecutiveNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give any number from 1-N");
        int num = input.nextInt();

        methodName(num);   //for test numbers 2, 3, 5,   30, 12, 15


        System.out.println("---------Manual TEST------------");
        methodName(2);
        methodName(3);
        methodName(5);
        methodName(30);
        methodName(12);
        methodName(15);
    }

    public static void methodName(int num) {
        boolean conditionDivBy2_3_5 = num % 2 == 0 && num % 3 == 0 && num % 5 == 0;
        boolean conditionDivBy3_5 = num % 3 == 0 && num % 5 == 0;
        boolean conditionDivBy2_3 = num % 3 == 0 && num % 2 == 0;
        boolean conditionDivBy2_5 = num % 2 == 0 && num % 5 == 0;
        boolean conditionDivBy2 = num % 2 == 0;
        boolean conditionDivBy3 = num % 3 == 0;
        boolean conditionDivBy5 = num % 5 == 0;


        if (conditionDivBy2_3_5) {
            System.out.println("CodilityTestCoders");
        } else if (conditionDivBy3_5) {
            System.out.println("TestCoders");

        } else if (conditionDivBy2_3) {
            System.out.println("TestCodility");

        } else if (conditionDivBy2_5) {
            System.out.println("CodilityCoders");

        } else if (conditionDivBy2) {
            System.out.println("Codility");
        } else if (conditionDivBy3) {
            System.out.println("Test");
        } else if (conditionDivBy5) {
            System.out.println("Coders");
        } else {
            System.out.println(num + " This number not dividable 2, 3 , 5 ");
        }


    }

}

