package jay.week02;

public class PrintConsecutiveNumbers_Jay {

    public static void main(String[] args) {
        Integer n = 24;

        String concatenation = "";

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                concatenation += "Codility";
            }
            if(i % 3 == 0){
                concatenation += "Test";
            }
            if(i % 5 == 0){
                concatenation += "Coders";
            }

            if(concatenation.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(concatenation);
            }

            concatenation = "";
        }
    }
}
