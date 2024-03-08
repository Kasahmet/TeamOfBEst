package Jay.week04;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfChars_Jay {

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD"));

    }

    public static String frequencyOfChars(String chars){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < chars.length(); i++) {

            Character eachChar = chars.charAt(i);

            if (!map.containsKey(eachChar)) {
                map.put(eachChar, 0);
            }

            map.put(eachChar, map.get(eachChar) + 1);
        }


        String frequency = "";

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            frequency += entry.getKey();
            frequency += entry.getValue();
        }
        return frequency;
        }
}
/*
String - Frequency of Characters`
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */