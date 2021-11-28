import java.util.Vector;

public class Prim {
    public Vector<Edge> primMST(int[][] adjacencyMatrix, int first) {
        Vector<Edge> x = new Vector<Edge>();
        int[] prev = new int[adjacencyMatrix.length];
        int[] cost = new int[adjacencyMatrix.length];
        int min = Integer.MAX_VALUE;
        int vmin = 0;

        //Initialize
        prev[first] = -1;

        for(int index = 1; index < adjacencyMatrix.length; index++) {
            prev[index] = first;
            if(adjacencyMatrix[index][prev[index]] == -1)
                cost[index] = Integer.MAX_VALUE;
            else 
                cost[index] = adjacencyMatrix[index][prev[index]];
        }

        for(int index = 1; index < adjacencyMatrix.length; index++) {
            min = Integer.MAX_VALUE;
            for(int i = 0; i < adjacencyMatrix.length; i++) {
                if(prev[i] != -1) {
                    if(cost[i] < min) {
                        min = cost[i];
                        vmin = i;
                    }
                }  
            }

            Edge edge = new Edge(prev[vmin],vmin,cost[vmin]);
            x.add(edge);
            prev[vmin] = -1;

            for(int j = 0; j < adjacencyMatrix.length; j++) {
                if(prev[j] != -1) {
                    if(adjacencyMatrix[vmin][j] != -1)
                    {
                        if(adjacencyMatrix[vmin][j] < cost[j]) {
                            cost[j] = adjacencyMatrix[vmin][j];
                            prev[j] = vmin;
                        }
                    }
                    
                }
            }
        }


        

        return x;
    }


    private void display(int[] cost, int [] prev) {
        for(int index = 0; index < cost.length; index++) {
            System.out.print(prev[index] + " ");
        }

        System.out.println();

        for(int index = 0; index < cost.length; index++) {
            System.out.print(cost[index] + " ");
        }

        System.out.println();

    }
}
