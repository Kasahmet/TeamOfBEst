package imane.week6;

public class MaxNumberInArray {


    public static int findMaxNumber(int[] array){

        if(array == null || array.length==0 )
         throw new IllegalArgumentException("Empty array or null");

        int max = Integer.MIN_VALUE;   // -2,147,483,648
        for (int num :array) {
          if(num > max){
             max = num ;
          }

        }
      return max;
    }

    public static void main(String[] args) {

        int [] numbers = {35,45,78,98,23,-52,67,99,45,65,76,89,66};
        System.out.println(findMaxNumber(numbers));

    }
}



