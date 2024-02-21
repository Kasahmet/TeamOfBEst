package anna.week2;

public class SwTwoNumbersWithoutThirdAnna {

    public static void main(String[] args) {

        //swap two variable's values without using a third variable
        
        int a = 10;
        int b = 20;

        //printing only for the visibility purpose
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        a += b; // a = 10+20 = 30
        b = a-b; //b = 30-20 = 10
        a -= b; // a = 30-10 = 20

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("--------------------------------------");

        // we could do relatively the same algorithm using multiplication (and division as it's special case)

        int c = 10;
        int d = 20;
        if (c != 0 && d !=0) {
            System.out.println("c = " + c);
            System.out.println("d = " + d);

            c *= d; //c = 10 * 20 = 200
            d = c / d; //d =  200/20 = 10
            c = c / d; //c = 200/10 = 20

            System.out.println("c = " + c);
            System.out.println("d = " + d);
        }
        
    }
}
