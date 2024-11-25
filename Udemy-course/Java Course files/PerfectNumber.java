public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int factor = 0, count = 0;
        for (int i = 0; i < number; i++){
            factor++;
            if(number % factor == 0){
                count += factor;
                if(count == number){
                    return true;
                }
            }
        }
        return false;
    }
}
