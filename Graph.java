public class Graph {
    private Edge[] edge;
    private int[] vertices;

    Graph() {
        edge = new Edge[1];
        vertices = new int[2];
    }

    Graph(int[][] adjacencyMatrix) {
        int count = 0;

        vertices = new int[adjacencyMatrix.length];

        //Find number of edges
        for(int row = 0; row < adjacencyMatrix.length; row++) {
            for(int col = 0; col < adjacencyMatrix.length; col++) {
                if(adjacencyMatrix[row][col] != -1 && adjacencyMatrix[row][col] != 0) {
                    count++;
                }
            }
        }

        edge = new Edge[count];
        count = 0;

        //Find edge and its weight
        for(int row = 0; row < adjacencyMatrix.length; row++) {
            for(int col = row; col < adjacencyMatrix.length; col++) {
                if(adjacencyMatrix[row][col] != -1 && adjacencyMatrix[row][col] != 0) {
                    edge[count].setBegin(row);
                    edge[count].setEnd(col);
                    edge[count].setWeight(adjacencyMatrix[row][col]);
                }
            }
        }
    }

    void setGraph(int[][] adjacencyMatrix) {
        int count = 0;

        vertices = new int[adjacencyMatrix.length];

        //Find number of edges
        for(int row = 0; row < adjacencyMatrix.length; row++) {
            for(int col = 0; col < adjacencyMatrix.length; col++) {
                if(adjacencyMatrix[row][col] != -1 && adjacencyMatrix[row][col] != 0) {
                    count++;
                }
            }
        }

        edge = new Edge[count];
        count = 0;

        //Find edge and its weight
        for(int row = 0; row < adjacencyMatrix.length; row++) {
            for(int col = row; col < adjacencyMatrix.length; col++) {
                if(adjacencyMatrix[row][col] != -1 && adjacencyMatrix[row][col] != 0) {
                    edge[count].setBegin(row);
                    edge[count].setEnd(col);
                    edge[count].setWeight(adjacencyMatrix[row][col]);
                }
            }
        }
    }

    Edge getEdge(int index) {
        return edge[index];
    }

    int getVertex(int index) {
        return vertices[index];
    }

    private class Edge {
        private int begin, end, weight;

        Edge() {
            begin = 0;
            end = 0;
            weight = 0;
        }

        Edge(int newBegin, int newEnd, int newWeight) {
            begin = newBegin;
            end = newEnd;
            weight = newWeight;
        }

        void setBegin(int newBegin) {
            begin = newBegin;
        }

        void setEnd(int newEnd) {
            end = newEnd;
        }

        void setWeight(int newWeight) {
            weight = newWeight;
        }

        int getBegin() {
            return begin;
        }

        int getEnd() {
            return end;
        }

        int getWeight() {
            return weight;
        }

    }
}
