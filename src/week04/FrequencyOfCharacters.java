package week04;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        frequencyOfCharacter("AAABBCDD");
    }
    public static void frequencyOfCharacter(String str){

        Map<Character, Integer> counter = new LinkedHashMap<>(); // key - each char and the value - is the frequency

        for(int i = 0; i < str.length(); i++){
            char eachChar = str.charAt(i);

            if(!counter.containsKey(eachChar)){
                counter.put(eachChar, 0);
            }

            counter.put(eachChar, counter.get(eachChar) + 1);

        }

        System.out.println(counter);

    }

}

/*1️⃣  String - Frequency of Characters`
        Write a return method that can find the frequency of characters
        Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2






 */