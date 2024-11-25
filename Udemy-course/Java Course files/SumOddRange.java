public class SumOddRange {
    public static boolean isOdd (int number){
        if (number < 0){
            return false;
        }
        return number % 2 == 1;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start){
            return -1;
        }
        if(start < 0 || end < 0){
            return -1;
        } else {
            for(int i = start; start <= end; start++){
                if(isOdd(start)){
                    sum += start;
                }
            }
        }
        return sum;
    }
}
