package imane.week1;

public class Divide_without_divisionOperator {

    public static int divideWithoutDivisionOperator(int n1,int n2) {

        if (n2 == 0) {
            System.out.println("invalid number");

        }
        System.out.println(n1+" divided by "+n2+" is : ");

        int count= 0  ;
         while( n1 >= n2) {
             n1 -= n2;
             count++;
         }
        System.out.println(count+" and a reminder is "+n1);
        return count;
     }

    public static void main(String[] args) {
        System.out.println(divideWithoutDivisionOperator(200,22));


    }

}
/*  Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator.*/
