package eve.week4;

import java.util.Arrays;
import java.util.Collections;

public class Task1_FrequencyOFCharacters_Eve {

      /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    //SOLUTION 1
    public static String FrequencyOfChars(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }


   //SOLUTION 2
    public static void frequencyOfChar(String str){


        String result = "";

        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if(!result.contains(each)){

                result += each + frequency;

}
        }

    }
    public static void main(String[] args) {
        // FrequencyOfChars("AAABBCDD");
        frequencyOfChar("AAABBCDD");

    }
}
