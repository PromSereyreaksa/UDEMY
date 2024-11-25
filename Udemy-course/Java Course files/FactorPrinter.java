public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(7);
    }


    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int count = 0;
        for (int i = 0; i < number; i++) {
            count++;
            if (number % count == 0) {
                System.out.println(count);
            }
        }
    }
}
