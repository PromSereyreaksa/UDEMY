public class isEvenNumber {
    public static void main(String[] args) {
        int i = 4;
        int count = 0, countOdd = 0;
        while (i <= 20){
            i++;

            if(!isEvenNumber(i)){
                countOdd++;

            } else if(isEvenNumber(i)){
                count++;
            }
            if(count == 5){
                break;
            }
            System.out.println(i+"-"+isEvenNumber(i));
        }
        System.out.println("Total odd numbers: "+countOdd+" Totally even numbers: "+count);

    }
    public static boolean isEvenNumber(int number){

        if(number < 0){
            return false;
        }
        return number % 2 == 0;

    }
}
