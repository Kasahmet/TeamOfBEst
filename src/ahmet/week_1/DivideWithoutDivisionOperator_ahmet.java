package ahmet.week_1;

public class DivideWithoutDivisionOperator_ahmet {

    public static void main(String[] args) {

        DivideWithoutDivisionOperator(4,2);


    }



    public static int DivideWithoutDivisionOperator(int num1,int num2) {


        boolean check_divisibility = num1 == 0 || num2 <= 0;

        if (check_divisibility) {
            System.err.println("You cannot divide by zero");
            return num1;
        }

        int result = num1/num2;

        System.out.println(result);


        return num1;}


}
