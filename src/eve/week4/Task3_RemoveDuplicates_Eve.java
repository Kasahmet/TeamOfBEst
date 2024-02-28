package eve.week4;

public class Task3_RemoveDuplicates_Eve {
     /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }
}
