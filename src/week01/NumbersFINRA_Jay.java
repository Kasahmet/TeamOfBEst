package week01;

public class NumbersFINRA_Jay {
    public static void finra(){

        for (int i = 1; i <= 30 ; i++) {

            if(i % 15 == 0){
                System.out.println("FINRA");
            }else if(i % 3 == 0){
                System.out.println("FIN");
            }else if(i % 5 == 0){
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }
    }
    public static void finra2(){

        for (int i = 1; i <= 30 ; i++) {

            String str = "";

            if(i % 3 == 0 ){
                str += "FIN";
            }

            if(i % 5 == 0){
                str += "RA";
            }

            if(str.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(str);
            }
        }
    }
    public static void main(String[] args) {

        finra();
        finra2();

    }
}
/*
Write a method that prints out the numbers from 1 to 30 but;
for numbers which are multiple of 3 print "FIN" instead of the number,
for numbers which are multiple of 5, print "RA" instead of the number,
and for numbers which are multiple of both 3 and 5, print "FINRA" instead of the number.

 */

