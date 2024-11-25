public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minute){
        if(minute < 0){
            System.out.println("Invalid Value");

        } //XX min = YY y and ZZ d
        else {
            long year = minute / 525600;
            long day =  minute % 525600;

            System.out.println(minute+" min = "+ year +" y and "+ day +" d");
            
        }
    }
}
