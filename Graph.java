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

        //Make set
        for(int index = 0; index < adjacencyMatrix.length; index++) {
            vertices[index] = index + 1;
        }

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
                    //edge[count].setBegin(row);
                    //edge[count].setEnd(col);
                    //edge[count].setWeight(adjacencyMatrix[row][col]);
                    edge[count] = new Edge(row, col,adjacencyMatrix[row][col]);
                    count++;
                }
            }
        }
    }

    public void setGraph(int[][] adjacencyMatrix) {
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

    public Edge getEdge(int index) {
        return edge[index];
    }

    public int getVertex(int index) {
        return vertices[index];
    }

    public int[] getVertices() {
        return vertices;
    }

    public Edge[] getEdge() {
        return edge;
    }

    // private void merge(Edge arr[], int l, int m, int r)
    // {
    //     // Find sizes of two subarrays to be merged
    //     int n1 = m - l + 1;
    //     int n2 = r - m;
  
    //     /* Create temp arrays */
    //     Edge L[] = new Edge[n1];
    //     Edge R[] = new Edge[n2];
  
    //     /*Copy data to temp arrays*/
    //     for (int i = 0; i < n1; ++i)
    //         L[i] = arr[l + i];
    //     for (int j = 0; j < n2; ++j)
    //         R[j] = arr[m + 1 + j];
  
    //     /* Merge the temp arrays */
  
    //     // Initial indexes of first and second subarrays
    //     int i = 0, j = 0;
  
    //     // Initial index of merged subarray array
    //     int k = l;
    //     while (i < n1 && j < n2) {
    //         if (L[i].getWeight() <= R[j].getWeight()) {
    //             arr[k] = L[i];
    //             i++;
    //         }
    //         else {
    //             arr[k] = R[j];
    //             j++;
    //         }
    //         k++;
    //     }
  
    //     /* Copy remaining elements of L[] if any */
    //     while (i < n1) {
    //         arr[k] = L[i];
    //         i++;
    //         k++;
    //     }
  
    //     /* Copy remaining elements of R[] if any */
    //     while (j < n2) {
    //         arr[k] = R[j];
    //         j++;
    //         k++;
    //     }
    // }
  
    // // Main function that sorts arr[l..r] using
    // // merge()
    // public void sort(Edge arr[], int l, int r)
    // {
    //     if (l < r) {
    //         // Find the middle point
    //         int m =l+ (r-l)/2;
  
    //         // Sort first and second halves
    //         sort(arr, l, m);
    //         sort(arr, m + 1, r);
  
    //         // Merge the sorted halves
    //         merge(arr, l, m, r);
    //     }
    // }

    // private class Edge {
    //     private int begin, end, weight;

    //     Edge() {
    //         begin = 0;
    //         end = 0;
    //         weight = 0;
    //     }

    //     Edge(int newBegin, int newEnd, int newWeight) {
    //         begin = newBegin;
    //         end = newEnd;
    //         weight = newWeight;
    //     }

    //     void setBegin(int newBegin) {
    //         begin = newBegin;
    //     }

    //     void setEnd(int newEnd) {
    //         end = newEnd;
    //     }

    //     void setWeight(int newWeight) {
    //         weight = newWeight;
    //     }

    //     int getBegin() {
    //         return begin;
    //     }

    //     int getEnd() {
    //         return end;
    //     }

    //     int getWeight() {
    //         return weight;
    //     }

    // }
}
