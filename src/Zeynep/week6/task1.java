package Zeynep.week6;

public class task1 {public static void main(String[] args) {
    int[] arr1 = {99,12,23,32,44,57,6};
    int max_number = findMaximum(arr1);
    System.out.println("max_number = " + max_number);
}
    public static int findMaximum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
