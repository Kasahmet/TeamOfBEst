package eve.week1;

public class Task2_DivideWithoutDivisionOperator {
/*
Write a method that can divide two numbers without using division operator

 */
public static int divides(int num1, int num2) {
    if(num2==0) {
        System.out.println("Invalid Number");


    }
    System.out.print(num1 +" divided by "+num2 +" is: ");
    int count =0;
    while(num1 >= num2) {
        num1 -= num2;
        count++;
    }
    System.out.println(count+" and remainder is "+num1);
    return count;
}

    public static void main(String[] args) {
        int result =divides(100,3);
        System.out.println(result);
    }


}
