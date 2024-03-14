package imane.week4;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removingDuplicates("aaabbbccd"));
    }
    public static String removingDuplicates(String str){

        String result  = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i) ;
             if (result.contains(""+each)){
                 continue;
             }
                 result += each;
        }
        return result;
    }

}
/*3️⃣  String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC*/