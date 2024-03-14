package Zeynep.week1;

public class task3 {
    public static void printNums(){
        for (int i = 1; i <=30 ; i++) {
            if (i %3==0 & i%5==0){
                System.out.print("FINRA ");
            } else if (i %5 ==0) {
                System.out.print("RA ");
            } else if (i %3 ==0 ) {
                System.out.print("FIN ");
            }else {
                System.out.print(i+" ");
            }

        }




    }

    public static void main(String[] args) {
        printNums();
    }


}
