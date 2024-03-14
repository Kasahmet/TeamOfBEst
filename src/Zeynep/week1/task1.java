package Zeynep.week1;

public class task1 {
    public static String identify(int number){
        if (number %2==0){
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String result1 = identify(5);
        String result2 = identify(6);

        System.out.println(result1);
        System.out.println(result2);
    }
}
