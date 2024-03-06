package Zeynep.week1;

public class task2 {
    public static void main(String[] args) {
        System.out.println(divide(24,-6));
    }
    public static int divide(int a, int b){
        int count = 0;

        if (b ==0){
            System.out.println("Sorry!Can`t divide by 0!");
        }else{
            if (b>0) {
                while (a >= b) {
                    a -= b;
                    count++;
                }
            }else {
                while (a > 0) {
                    a += b;
                    count--;
                }
            }
        }
        return count;
    }
}
