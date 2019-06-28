import java.util.*;
class Graph
{
    private int numVertices;
    private LinkedList<Integer> adjLists[];
 
    Graph(int vertices)
    {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        
        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }
 
    void addEdge(int src, int dest)
    {
        adjLists[src].add(dest);
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (Integer j : adjLists[i]) {
                s.append(j + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
 
    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
         g.addEdge(0, 1);
         g.addEdge(0, 2);
         g.addEdge(1, 2);
         g.addEdge(2, 3);
         g.addEdge(3,1);
         g.addEdge(3,2);
         g.addEdge(3,3);
         
         
         System.out.println(g.toString());
         
         /* Outputs
         0: 1 2 
         1: 2
         2: 3
         3: 1 2 3
        */
    }
}