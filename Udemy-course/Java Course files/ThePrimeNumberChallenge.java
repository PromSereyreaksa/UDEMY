public class ThePrimeNumberChallenge {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number");
            if (isPrime(i)) {
                count++;
            }
            if (count == 3) {
                System.out.println("Found "+count+" Exiting for loop");
                break;
            }
        }

        System.out.println("Total prime numer is " + count);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
