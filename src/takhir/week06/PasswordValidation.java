package takhir.week06;

public class PasswordValidation {
    public static void main(String[] args) {

        //not working
        String password = "jelloj_12 ";
        System.out.println("validateMethod(password) = " + validateMethod(password));


    }


    public static boolean validateMethod(String passwordFull) {
        char[] singleCharOfPassword = passwordFull.trim().toCharArray(); //




        if (singleCharOfPassword.length > 6) {
            int count1 =0;
            int count2 =0;
            int count3 =0;
            int count4 =0;

                        for (int i = 0; i < singleCharOfPassword.length; i++) {

                            //check for UpperCase letters
                            if (65 <= singleCharOfPassword[i]  &&  90 >= singleCharOfPassword[i]  ){
                                count1++;
                                System.out.println("ok upper " + singleCharOfPassword[i]);
                            }
                            //check for LowerCase Letters
                            if (97 <= singleCharOfPassword[i] && 122 >= singleCharOfPassword[i]) {
                                System.out.println("ok lower " + singleCharOfPassword[i]);
                                count2++;
                            }
                            //check for Special Chars
                            if (33 <= singleCharOfPassword[i] && 47 >= singleCharOfPassword[i]
                                    || 58 <= singleCharOfPassword[i] && 64 >= singleCharOfPassword[i]
                                    || 91 <= singleCharOfPassword[i] && 96 >= singleCharOfPassword[i]
                                    || 123 <= singleCharOfPassword[i] && 126 >= singleCharOfPassword[i]
                            ) {
                                System.out.println("ok special " + singleCharOfPassword[i]);
                                count3++;

                            }
                            //check for numbers
                            if (48 <= singleCharOfPassword[i] && 57 >= singleCharOfPassword[i]) {
                                System.out.println("ok digit " + singleCharOfPassword[i]);
                                count4++;
                            }


                            if(count1 >= 1 &&   count2 >= 1 &&   count3>= 1 &&   count4>= 1){
                                System.out.println("ok");
                            }else {
                                System.out.println("not ok");
                            }

                        }
            return true;
        }
        return false ;

    }

}

/*
String_PasswordValidation
Write a return method that can verify if a password is valid or not.
-Requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
* */
