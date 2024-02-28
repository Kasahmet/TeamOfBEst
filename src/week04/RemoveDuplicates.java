package week04;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        char prev = str.charAt(0);
        sb.append(prev);

        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != prev) {
                sb.append(current);
                prev = current;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("After removing duplicates: " + result);
    }
}

/*
 3️⃣  String - Remove Duplicates
        Write a return method that can remove the duplicated values from the String
        Ex: removeDup("AAABBBCCC") ==> ABC

 */