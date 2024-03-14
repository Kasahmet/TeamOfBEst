package jay.week06;

public class Array_FindMaximum_Jay {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 17;
        numbers[2] = 9;

        System.out.println(FindMaximumNumber(numbers)
        );
    }


    public static int FindMaximumNumber(int[] numbers){

        int maxNumber = 0;

        for (int each : numbers) {
            if(each > maxNumber){
                maxNumber = each;
            }
        }

        return maxNumber;
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */