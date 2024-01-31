package anna.week1;

public class FinRa {
    FINRA();
}
    public static void FINRA(){

        for (int i = 1; i <=30; i++) {
            if (i % 15 == 0){ //first checking divisibility by 15, because if a number is divisible by 15, it is ALSO divisible by both 3 and 5, so we need this condition to be checked first
                System.out.println("FINRA");
            } else if (i % 3 == 0){
                System.out.println("FIN");
            } else if (i % 5 == 0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }

    }
}
