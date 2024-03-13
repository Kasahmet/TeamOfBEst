package eve.week6;

public class Task2_MaxValueInArray_Eve {

    public static int maxValue( int[]  n ) {
        //int max = Integer.MIN_VALUE;
        int max = n[0]; //Assume the first element is maximum
        for(int each: n)
            if(each > max)
                max = each;

        return max;
    }
    public static void main(String[] args) {
        int[] n = {5, 2, 9, 1, 7, 10,-10};
        int maxNumber = maxValue(n);
        System.out.println("Maximum number: " + maxNumber);
    }
}

