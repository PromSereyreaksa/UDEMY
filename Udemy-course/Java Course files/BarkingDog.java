public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 && hourOfDay > 23){
            return false;
        }else if(barking && hourOfDay < 8){
            return true;
        }else return barking && hourOfDay > 22;
    }
}
