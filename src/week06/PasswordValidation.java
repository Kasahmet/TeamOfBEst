package week06;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "MyPassword@123";
        System.out.println(validatePassword(password));
    }

    public static boolean validatePassword(String password) {
        // Check length and space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check for at least one upper-case letter
        boolean hasUpperCase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        // Check for at least one lower-case letter
        boolean hasLowerCase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            return false;
        }

        // Check for at least one special character
        boolean hasSpecialChar = false;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Check for at least one digit
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        return hasDigit;
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




 */