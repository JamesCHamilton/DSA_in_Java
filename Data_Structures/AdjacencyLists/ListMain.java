package Data_Structures.AdjacencyLists;

public class ListMain {
    /*
     * Adjacency List = An array/arraylist of linkedlists
     *                  Each LinkedList  has a unique node at the head
     *                  All adajcent neighbors to that node are added to that node's linkedList
     *                  
     *                  runtime complexity to check an Edge: O(V)
     *                  space complexity: O(V+E)
     */
    public static void main(String[] args) {
        ListGraph graph = new ListGraph();
        graph.addNode(new ListNode('A'));
        graph.addNode(new ListNode('B'));
        graph.addNode(new ListNode('C'));
        graph.addNode(new ListNode('D'));
        graph.addNode(new ListNode('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.printer();
        
    }
}
