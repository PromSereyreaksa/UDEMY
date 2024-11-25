public class SharedDigit {


    public static boolean hasSharedDigit(int digit1, int digit2) {
        // Check if the input numbers are in the valid range (10-99)
        if ((digit1 < 10 || digit1 > 99) || (digit2 < 10 || digit2 > 99)) {
            return false;
        }

        // Extract the digits of the first number
        int firstDigit1 = digit1 / 10;
        int firstDigit2 = digit1 % 10;

        // Extract the digits of the second number
        int secondDigit1 = digit2 / 10;
        int secondDigit2 = digit2 % 10;

        // Check if any digit in digit1 is present in digit2
        return (firstDigit1 == secondDigit1 || firstDigit1 == secondDigit2 ||
                firstDigit2 == secondDigit1 || firstDigit2 == secondDigit2);
    }
}