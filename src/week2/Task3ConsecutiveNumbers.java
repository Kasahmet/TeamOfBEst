package week2;

public class Task3ConsecutiveNumbers {



    public static void main(String[] args) {
        consecutiveNumbers(35);
    }
    public static void consecutiveNumbers(int n){

        for(int i = 1; i <= n; i++){
            String result = "";

            if(i % 2 == 0){
                result += "Codility";
            }

            if(i % 3 == 0){
                result += "Test";
            }

            if(i % 5 == 0){
                result += "Coders";
            }

            System.out.println(result.isEmpty() ? i : result);
        }

    }



}
  /*
        Consecutive Numbers

        Write a function that,  given N value will be a positive integer, prints consecutive numbers from 1 to N, each on a separate line.
        However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
        If a number is divisible by more than one of the numbers it should be replaced by a concatenation of the respective words Codility.
       Example of a number being divisible by 2 & 3: CodilityTest
       Example of a number being divisible by 2,3 & 5:CodilityTestCoders

     */
