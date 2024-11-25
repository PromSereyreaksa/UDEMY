public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(12345));

    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;

        for (int i = 0; i < number; i++) {
            sum = sum + number % 10;
            number = number / 10;


        }

        return sum + number;
    }

}
