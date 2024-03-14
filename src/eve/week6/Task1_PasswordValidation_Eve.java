package eve.week6;

public class Task1_PasswordValidation_Eve {

    public static boolean isPasswordValid(String password) {

        // Check if password length is at least 6 characters and does not contain a space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsSpecialChar = false;
        boolean containsDigit = false;

        // Iterate through each character in the password
        for (char c : password.toCharArray()) {
            // Check if the character is an uppercase letter
            if (Character.isUpperCase(c)) {
                containsUpperCase = true;
            }
            // Check if the character is a lowercase letter
            else if (Character.isLowerCase(c)) {
                containsLowerCase = true;
            }
            // Check if the character is a special character
            else if (!Character.isLetterOrDigit(c)) {
                containsSpecialChar = true;
            }
            // Check if the character is a digit
            else if (Character.isDigit(c)) {
                containsDigit = true;
            }
        }

        // Check if all requirements are met
        if (containsUpperCase && containsLowerCase && containsSpecialChar && containsDigit) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // Test the password verification method
        String password = "Abc@1234";
        boolean isValid = isPasswordValid(password);
        System.out.println("Is the password valid? --> " + isValid);
    }

}
