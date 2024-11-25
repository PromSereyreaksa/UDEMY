public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        int rows, cols;
        int currentRows, CurrentCols;
        for (rows = 0; rows < number; rows++) {
            System.out.println("*");
        }

    }
}
