package tatiana.week_06;

public class Array_FindMaximum {
    public static void main(String[] args) {

        int[] arr = {199, 102, 23, 2, 46, 7, 69};
        int max = arr[0]; // 100 assume that first element is hte maximum number

        for (int i = 1; i < arr.length; i++) { // i: 1, 2, 3, 4, 5
            if (arr[i] > max) { // compares the element of hte array with current maximum number
                max = arr[i]; // replace the current maximum number
            }
        }
        System.out.println("max = " + max);
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */
