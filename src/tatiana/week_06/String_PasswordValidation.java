package tatiana.week_06;

public class String_PasswordValidation {
    public static boolean isValidPassword(String password) {
        // Check if password length is at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Check if password contains at least one upper-case letter
        boolean hasUpperCase = false;
        // Check if password contains at least one lower-case letter
        boolean hasLowerCase = false;
        // Check if password contains at least one special character
        boolean hasSpecialChar = false;
        // Check if password contains at least one digit
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                // Special characters are those that are not letters or digits
                hasSpecialChar = true;
            }
        }

        // Check if all requirements are met
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    public static void main(String[] args) {
        String password = "Tatiana03/13/2024";
        boolean isValid = isValidPassword(password);
        System.out.println("Is the password valid? " + isValid);
    }
    /*
    This method checks each requirement separately and returns false if any of them are not met.
    If all requirements are met, it returns true.
    The main method demonstrates how to use this isValidPassword method with an example password.
     */
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
