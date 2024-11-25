public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        /*
        The cats spend most of the day playing. In particular,
        they play if the temperature is between 25 and 35 (inclusive).
        Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
         */
        if(summer && temperature >= 25 && temperature <= 45){
            return true;
        } else return !summer && temperature >= 25 && temperature <= 35;

    }
}
