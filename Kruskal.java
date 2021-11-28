import java.util.Vector;

public class Kruskal {
    public Vector<Edge> kruskalMST(Graph graph) {
        SubSet a = new SubSet();
        SubSet b = new SubSet();
        Vector<Edge> x = new Vector<>();
        //Make set
        int[] set = graph.getVertices();

        //Sort edges
        Edge[] sortedEdge = graph.getEdge();
        sort(sortedEdge,0,sortedEdge.length - 1);

        //Find
        for(int index = 0; index < sortedEdge.length; index++) {
            a = find(set, sortedEdge[index].getBegin());
            b = find(set, sortedEdge[index].getEnd());
            if(a != b) {
                x.add(sortedEdge[index]);
                union(set, a, b);
            }
        }

        return x;
    }

    private void union(int[] set, SubSet a, SubSet b) {

        if(a.getHeight() == b.getHeight()) {
            set[b.getTop()] = a.getTop();
        }
        else if (a.getHeight() > b.getHeight()) {
            set[b.getTop()] = a.getTop();
        }
        else {
            set[a.getTop()] = b.getTop();
        }
        
    }

    private SubSet find(int[] set, int index) {
        SubSet subset = new SubSet(index,1);
        int i = index;

        while(set[i] != i) {
            i = set[i];
            subset.setTop(i);
            subset.setHeigh(subset.getHeight() + 1);
        }

        return subset;
    }

    // Main function that sorts arr[l..r] using
    // merge()
    private void sort(Edge arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    private void merge(Edge arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        Edge L[] = new Edge[n1];
        Edge R[] = new Edge[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getWeight() <= R[j].getWeight()) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    

    





}