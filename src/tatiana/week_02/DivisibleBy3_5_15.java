package tatiana.week_02;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        //I will create separate Strings for all three category, to store divisible numbers
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        String divisibleBy15 = "";

        // I will use loop to go through 1 to 100
        for (int i = 1; i <= 100; i++) {
            //1 - if the number can be divisible by 3,5 and 15, then it should only be displayed in DivisibleB15 section
            if (i % 15 == 0) { // will start with divisibleBy15, as those numbers are divisible by 3,5 and 15
                //if i divisible by 15 with no reminder
                divisibleBy15 += i + " ";  //adding empty space to make numbers readable, when I print

                //2 - if the number can be divisible by 3 but can't be divisible by 15 then it should only be displayed in DivisibleB15 section
            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";

                //3 - if the number can be divisible by 5 but can't be divisible by 15 then it should only be displayed in DivisibleB15 section
            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }
        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 3: " + divisibleBy3);
        System.out.println("Divisible By 5: " + divisibleBy5);
    }
}
