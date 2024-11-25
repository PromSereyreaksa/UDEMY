public class NumberToWords {


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digit;
        int digitA = getDigitCount(number);
        int rev = reverse(number);
        int digitB = getDigitCount(rev);
        do {
            digit = rev % 10;
            switch (digit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            rev /= 10;
        } while (rev != 0);

        for (int i = digitB; i < digitA; i++) {
            System.out.println("Zero");
        }


    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number != 0);
        return count;
    }
}
