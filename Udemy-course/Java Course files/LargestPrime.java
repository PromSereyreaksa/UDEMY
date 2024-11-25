public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        if (number == 2 || number == 3) {
            return number;
        }

        int largestPrimeFactor = 1;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largestPrimeFactor = Math.max(largestPrimeFactor, i);
                }

                isPrime = true;
                for (int j = 2; j <= Math.sqrt(number / i); j++) {
                    if ((number / i) % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    largestPrimeFactor = Math.max(largestPrimeFactor, number / i);
                }
            }
        }

        return largestPrimeFactor;
    }}
