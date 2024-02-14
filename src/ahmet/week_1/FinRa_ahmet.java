package ahmet.week_1;

public class FinRa_ahmet {

    public static void main(String[] args) {



    for(int i = 0 ; i<=30; i++){

        int  num =i;
        System.out.print(num+" ");


    }
    System.out.println();
    System.out.println("---------------------------------------------");

    for(int i = 0 ; i<=30; i++) {

        if (i % 15 == 0) {


            System.out.println("FINRA");


        } else if (i % 5 == 0) {

            System.out.println("RA");


        } else if (i % 3 == 0) {

            System.out.println("FI");


        } else {

            System.out.println(i);
        }


    }}}



