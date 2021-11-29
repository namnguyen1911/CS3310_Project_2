import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // //Declaration
        // Kruskal kruskalMST = new Kruskal();
        // Prim primMST = new Prim();
        // Graph graph;

        // //Initialize
        // boolean dense = true;
        // boolean sparse = false;

        // //Manualy create graphes
        // int[][] matrix1 = {{0,10,-1,30,45,-1},{10,0,50,-1,40,25},{-1,50,0,-1,35,15},{30,-1,-1,0,-1,20},{45,40,35,-1,0,55},{-1,25,15,20,55,0}};
        // int[][] matrix2 = {{0,7,-1,12,-1,-1,-1,-1,-1,-1},
        //                     {7,0,-1,-1,10,-1,-1,-1,-1,-1},
        //                     {-1,-1,0,8,-1,-1,-1,-1,-1,-1},
        //                     {12,-1,8,0,13,-1,-1,4,-1,-1},
        //                     {-1,10,-1,13,0,26,-1,1,8,-1},
        //                     {-1,-1,-1,-1,26,0,-1,-1,-1,17},
        //                     {-1,-1,-1,-1,-1,-1,0,175,-1,-1},
        //                     {-1,-1,-1,4,1,-1,175,0,3,-1},
        //                     {-1,-1,-1,-1,8,-1,-1,3,0,6},
        //                     {-1,-1,-1,-1,-1,17,-1,-1,6,0}};

        
        // //Randomly generate adjacency matrices
        // int[][] matrix3 = adjacencyMatrix(20, dense);
        // int[][] matrix4 = adjacencyMatrix(20, sparse);

        // //Run Kruskal's algorithm
        // graph = new Graph(matrix2);
        // displayGraph(kruskalMST.kruskalMST(graph));

        // //Run Prim's algorithm
        // displayGraph(primMST.primMST(matrix2, 0));

        //Declaration and Initialization
        boolean dense = true;
        boolean sparse = false;
        boolean type = false;
        int size = 0, range = 0, option = 0;
        long startTime = 0, endTime = 0, duration = 0;

        Scanner scan = new Scanner(System.in);
        Kruskal kruskalMST = new Kruskal();
        Prim primMST = new Prim();
        Graph graph;


        //Prompt user enter the size of matrices
        System.out.print("Enter the size of the matrix: ");
        size = scan.nextInt();
        
        
        //Remove the new line character in the input buffer
        scan.nextLine();

        //Prompt user enter the sample size of the test
        System.out.print("Enter the sample size of the test: ");
        range = scan.nextInt();

        scan.nextLine();

        System.out.println("===========================================================");
        System.out.println("Option: ");
        System.out.println("1. Dense");
        System.out.println("2. Sparse");
        System.out.println("===========================================================");
        System.out.print("Enter your option: ");

        //Type of graph
        if(option == 1) {
            type = dense;
        }
        else {
            type = sparse;
        }

        //Generate adjacency matrix
        int[][] matrix = adjacencyMatrix(size, type);
        

        //Display the matrix
        //System.out.println("The matrix is: ");
        //display(matrix);



        //Remove the new line character in the input buffer
        scan.nextLine();

        while(true) {
            System.out.println("===========================================================");
            System.out.println("Option: ");
            System.out.println("1. Kruskal's algorithm");
            System.out.println("2. Prim's algorithm");
            System.out.println("3. Choose other matrices");
            System.out.println("4. Quit");
            System.out.println("===========================================================");
            System.out.print("Enter your option: ");
            
            option = scan.nextInt();

            if(option == 1) {
                System.out.println("The result by using Kruskal's algorithm is: ");

                graph = new Graph(matrix);

                
                //Record the starting time of the algorithm
                startTime = System.nanoTime();

                //Run the algorithm
                for(int count = 0; count < range; count++) {
                    kruskalMST.kruskalMST(graph);
                }

                //Display the result of multiplication on the screen
                //displayGraph(kruskalMST.kruskalMST(graph));
        
                //Record the ending time of the algorithm
                endTime = System.nanoTime();

                //Calculate the duration of the execution
                duration = endTime - startTime;

                //Display the total and average time of execution on the screen
                System.out.println("The total execution time of " + range + " sample size (nano time) is: " + duration + " nano time");
                System.out.println("The total execution time of " + range + " sample size (milliseconds) is: " + (duration / 1000000.0) + " milliseconds");
                System.out.println("The average execution time of " + range + " sample size (milliseconds) is: " + (duration / range) / 1000000.0 + " milliseconds");
            }
            else if (option == 2) {
                System.out.println("The result by using Prim's algorithm is: ");
                
                //Record the starting time of the algorithm
                startTime = System.nanoTime();

                //Run the algorithm
                for(int count = 0; count < range; count++) {
                    primMST.primMST(matrix, 0);
                }

                //Display the result of multiplication on the screen
                //displayGraph(primMST.primMST(matrix, 0));
        
                //Record the ending time of the algorithm
                endTime = System.nanoTime();

                //Calculate the duration of the execution
                duration = endTime - startTime;

                //Display the total and average time of execution on the screen
                System.out.println("The total execution time of " + range + " sample size (nano time) is: " + duration + " nano time");
                System.out.println("The total execution time of " + range + " sample size (milliseconds) is: " + (duration / 1000000.0) + " milliseconds");
                System.out.println("The average execution time of " + range + " sample size (milliseconds) is: " + (duration / range) / 1000000.0 + " milliseconds");
            }
            else if (option == 3) {
                //Prompt user enter the size of matrices
                System.out.print("Enter the size of the matrix: ");
                size = scan.nextInt();
                
                
                //Remove the new line character in the input buffer
                scan.nextLine();

                //Prompt user enter the sample size of the test
                System.out.print("Enter the sample size of the test: ");
                range = scan.nextInt();
                System.out.print("\n");

                //Remove the new line character in the input buffer
                scan.nextLine();

                System.out.println("===========================================================");
                System.out.println("Option: ");
                System.out.println("1. Dense");
                System.out.println("2. Sparse");
                System.out.println("===========================================================");
                System.out.print("Enter your option: ");

                //Type of graph
                if(option == 1) {
                    type = dense;
                }
                else {
                    type = sparse;
                }

                //Generate adjacency matrix
                matrix = adjacencyMatrix(size, type);
                

                //Display the matrix
                //System.out.println("The matrix is: ");
                //display(matrix);

                
            }
            else {
                break;
            }
        } 
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
                return rand.nextInt(99) + 1;
            }
            else {
                return -1;
            }
        }
        //Sparse graph (3:7)
        else {
            if(number >= 7) {
                return rand.nextInt(99) + 1;
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

    private static void displayGraph(Vector<Edge> mst) {
        int count = 0;
        System.out.println("==============");
        for(int index = 0; index < mst.size(); index++) {
            count += mst.get(index).getWeight();
            System.out.println("(" + mst.get(index).getBegin() + "," + mst.get(index).getEnd() + ") " + mst.get(index).getWeight());
        }
        System.out.println("MST = " + count);
        System.out.println("===============");
    }

    

}
