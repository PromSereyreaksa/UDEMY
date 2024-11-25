public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(3322));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        sum += number % 10; // get last digit
        while (number >= 10){ // get first digit
            number /= 10;
        }
        return sum + number;
    }
}
