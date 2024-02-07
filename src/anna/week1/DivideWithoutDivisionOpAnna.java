package anna.week1;

public class DivideWithoutDivisionOpAnna {
    public static void main(String[] args) {

        System.out.println(DivideWithoutDivisionOperator(49, 7));

    }

    public static int DivideWithoutDivisionOperator(int a, int b) {
        int count = 0;

        //we could check the divisibility first by adding a condition if(a % b == 0){ , but that was not asked
        if (a < 0) {
            System.err.println("Sorry, cannot use this code");
        }
        if (b == 0) {
            System.err.println("You cannot divide by zero");
        } else {

            if (b > 0) {
                while (a >= b) {
                    a -= b;
                    count++;
                }
            } else {
                while (a > 0) {
                    a += b;
                    count--;
                }
            }

        }
        return count;
    }
}