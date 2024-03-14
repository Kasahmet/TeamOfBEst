package imane.week4;

public class FrequencyOfTheCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("addddhjkkk"));


    }


    public static String frequencyOfCharacters(String str) {

        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += count;
        }

        return result;

    }
}
/*1️⃣  String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2*/