package eve.week2;

public class Task1_SwapNumbers_Eve {
    //Solution 1:


    public static void swaptwonumbers1(int a, int b){


        a = a +b;
        b = a - b;
        a = a - b;
    }



    //Solution 2:
    public static void swaptwonumbers2(int a, int b){

//here a and b should not be 0

        a = a*b;
        b = a/b;
        a = a/b;
    }


}
