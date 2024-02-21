package tatiana.week_02;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        // Creating StringBuilder objects for each category
        StringBuilder divisibleBy3 = new StringBuilder();
        StringBuilder divisibleBy5 = new StringBuilder();
        StringBuilder divisibleBy15 = new StringBuilder();

        // Looping through numbers 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15.append(i).append(" "); // Appending to StringBuilder
            } else if (i % 3 == 0) {
                divisibleBy3.append(i).append(" ");
            } else if (i % 5 == 0) {
                divisibleBy5.append(i).append(" ");
            }
        }

        // Converting StringBuilder objects to strings for output
        String resultBy15 = divisibleBy15.toString();
        String resultBy3 = divisibleBy3.toString();
        String resultBy5 = divisibleBy5.toString();

        // Printing the results
        System.out.println("Divisible By 15: " + resultBy15);
        System.out.println("Divisible By 3: " + resultBy3);
        System.out.println("Divisible By 5: " + resultBy5);
    }
}
