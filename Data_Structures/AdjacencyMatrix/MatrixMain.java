package Data_Structures.AdjacencyMatrix;

public class MatrixMain {
    /*
     * Adjacency Matrix = An array to store 1's /0's to represent edges 
     * number of rows = number of unique nodes
     * number of columns - number of unique nodes 
     * 
     * runtime complexity to check an Edge : O(1)
     * space complexity: O(v^2) V = number of vertexes (nodes) 
     * 
     */
    public static void main(String[] args) {
        MatrixGraph graph = new MatrixGraph(5);


        graph.addNode(new MatrixNode ('A'));
        graph.addNode(new MatrixNode ('B'));
        graph.addNode(new MatrixNode ('C'));
        graph.addNode(new MatrixNode ('D'));
        graph.addNode(new MatrixNode ('E'));
        

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.printer();
    }
}
