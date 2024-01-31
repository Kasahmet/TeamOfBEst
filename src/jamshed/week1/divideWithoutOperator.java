package jamshed.week1;

public class divideWithoutOperator {
    public static void main(String[] args) {
        divide(32, 8);


    }

    public static void divide(int n1, int n2) {

        if (n2 == 0) {
            System.out.println("CANNOT DIVIDE BY ZERO");
            return;
        }

        int count = 0;
        String result = n1 + " / " + n2 + " is ";

        while (n1 >= n2) {
            count++;
            n1 -= n2;
        }

        System.out.println(result + count + " with remainder " + n1);

    }

}


/*
2️⃣  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.
 */