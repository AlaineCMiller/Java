//Reference: http://www.javawithus.com/programs/armstrong-numbers

public class ArmstrongNumbers {

    public static boolean isArmstrongNumber(int input) {
        String inputAsString = input + "";
        int numberOfDigits = inputAsString.length();
        int copyOfInput = input;
        int sum = 0;
        while (copyOfInput != 0) {
            int lastDigit = copyOfInput % 10;
            sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
            copyOfInput = copyOfInput / 10;
        }
        if (sum == input) {
            return true;
        } else {
            return false;
        }
    }
}
