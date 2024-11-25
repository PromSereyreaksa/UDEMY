public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return -1;
        } else {
            double milesPerhour = kilometersPerHour / 1.609;
            long rounded = Math.round(milesPerhour);
            return rounded;
        }

    }


    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid value");
        }else{
            double milesPerhour = kilometersPerHour * 1.609;
            System.out.println(+kilometersPerHour+ " km/h = " +milesPerhour+ " mi/h");
        }
    }

}