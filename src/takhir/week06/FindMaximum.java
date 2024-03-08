package takhir.week06;

public class FindMaximum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("The Number maximum is" + maxFind(arr));
    }

    public static int maxFind(int[] arrayNumbers){
        int max = 0;
        for (int each : arrayNumbers) {
            if(each > max){
                max = each;
            }
        }

        return max;
    }
}

/*
2️  Array_FindMaximum
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

*/