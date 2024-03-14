package jay.week06;

public class String_PasswordValidation_Jay {

    public static boolean passwordValidation(String password){ //aaa

        boolean valid = true;
        int count = 0;

        if(password.contains(" ") || password.length() < 6){
            valid = false;
            return valid;
        }


        for (int i = 0; i < password.length(); i++){

            if(password.charAt(i) > 64 && password.charAt(i) < 91){
                count ++;
            }
            if(password.charAt(i) > 96 && password.charAt(i) < 123){
                count++;
            }
            if(password.charAt(i) > 32 && password.charAt(i) < 48){
                count++;
            }
            if(password.charAt(i) > 57 && password.charAt(i) < 65){
                count++;
            }
            if(password.charAt(i) > 90 && password.charAt(i) < 97){
                count++;
            }
            if(password.charAt(i) > 122 && password.charAt(i) < 127){
                count++;
            }
            if(password.charAt(i) > 47 && password.charAt(i) < 58){
                count++;
            }
        }

        if((count > 5)){
            return valid;
        }else{
            valid = false;
            return valid;
        }


    }

    public static void main(String[] args) {

        System.out.println(passwordValidation("Aa*456")); // should return true
        System.out.println(passwordValidation("345 ")); // should return false

    }
}
/*
Write a return method that can verify if a password is valid or not.
-Requirements:
Password MUST be at least have 6 characters and should not contain space
PassWord should at least contain one upper-case letter
PassWord should at least contain one lowercase letter
Password should at least contain one special character
Password should at least contain a digit
-if all requirements above are met, the method returns true, otherwise returns  false
 */