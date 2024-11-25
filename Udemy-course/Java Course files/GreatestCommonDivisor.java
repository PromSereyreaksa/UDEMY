

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divisior = 0;
        int count = 0;
        for (int i = 0; i < first && i < second; i++) {
            divisior++;
            if (first % divisior == 0 && second % divisior == 0) {
                count = divisior;
            }
        }
        return count;
    }
}
