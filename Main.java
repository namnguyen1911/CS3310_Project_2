import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean dense = true;
        boolean sparse = false;

        int [][] matrix1 = adjacencyMatrix(4, dense);
        int [][] matrix2 = adjacencyMatrix(4, sparse);

        display(matrix1);
        display(matrix2);
    }

    private static int[][] adjacencyMatrix(int size, boolean typeOfGraph) {

        int number = 0;

        int[][] matrix = new int[size][size];

        Random rand = new Random();
        
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                if(row == col) {
                    matrix[row][col] = 0;
                }
                else {
                    number = pool(rand.nextInt(10) + 1, typeOfGraph);
                    matrix[row][col] = number ;
                    matrix[col][row] = number ;
                }
            }
        }

        return matrix;
    }

    private static int pool(int number, boolean typeOfGraph) {

        Random rand = new Random();

        //Dense graph (7:3)
        if(typeOfGraph == true ) {
            if(number <= 7) {
                return rand.nextInt(100);
            }
            else {
                return -1;
            }
        }
        //Sparse graph (3:7)
        else {
            if(number >= 7) {
                return rand.nextInt(100);
            }
            else {
                return -1;
            }
        }
    }

    private static void display(int[][] matrix) {
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
