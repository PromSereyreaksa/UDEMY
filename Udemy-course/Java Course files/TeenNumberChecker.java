public class TeenNumberChecker {
    public static boolean hasTeen (int a, int b, int c){
        if(a >= 13 && a <= 19){
            return true;
        } else if (b >= 13 && b <= 19){
            return true;
        } else return c >= 13 && c <= 19;
    }
    public static boolean isTeen(int d){
        return d >= 13 & d <= 19;
    }
}
