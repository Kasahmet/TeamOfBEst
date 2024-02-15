package week2;

public class Task2DivisibleBY {


    public static void main(String[] args) {
        int n = 100;
        String by15 = "", by5 = "", by3 = "";

        for(int i = 1; i <= n; i++){

            if(i % 15 == 0){
                by15 += i + " ";
            } else if(i % 5 == 0){
                by5 += i + " ";
            } else if(i % 3 == 0){
                by3 += i + " ";
            }
        }

        System.out.println("Divisible by 15: " + by15);
        System.out.println("Divisible by 5: " + by5);
        System.out.println("Divisible by 3: " + by3);

    }
}
 /*
        Divisible By 3, 5 & 15

        Write a program that will print all the numbers divisible by 3, 5, and 15 in the range from 1 to 100
         Print the grouped sections separately

         Ex:
            input: 100
            output:
                 Divisible By 15: 15 30 45 60 75 90
                 Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
