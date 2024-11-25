public class Sum3And5Challenge {
    public static void main(String[] args) {
        int count = 0,a = 0;
        for(int i = 1; i < 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                a = a + i;
                System.out.print(i+" ");

                count++;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("= "+a);
        System.out.println(count+ " numbers");
    }
}
