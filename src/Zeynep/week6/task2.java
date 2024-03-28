package Zeynep.week6;

public class task2 {
    public static boolean isValidPassword(String password){
        if (password.length()<6 || password.contains(" ")){
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;



        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (isUpperCase(c)){
                hasUpperCase = true;
            } else if (isLowerCase(c)) {
                hasLowerCase = true;
            } else if (isDigit(c)) {
                hasDigit = true;
            } else if (!isLetterOrDigit(c)) {
                hasSpecial = true;
            }

        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecial;
    }

    private static boolean isUpperCase(char c){
        return c >='A' && c <='Z';
    }

    private static boolean isLowerCase(char c){
        return c >='a' && c <='z';
    }

    private static boolean isDigit(char c){
        return c >='0' && c <='9';
    }

    private static boolean isLetterOrDigit(char c){
        return isUpperCase(c) || isLowerCase(c)|| isDigit(c);
    }

    public static void main(String[] args) {
        System.out.println("PasSword1" +" "+ isValidPassword("PasSword1"));

        System.out.println("password" +" "+ isValidPassword("password"));

        System.out.println("Pas$w0rd" +" "+ isValidPassword("Pas$w0rd"));

    }
}
