package Algorithms.BreadthFirstSearch;

public class BFSMain {
    /*
     * BFS = a seach algorithm for traversing a tree or graph data structure.
     * This is done one "level" at a time, rather than one "branch" at a time like Depth First Search
     * Instead of searching one path like in DFS it checks adjacent nodes in both directions and then adds it to a queue
     * and then adds the neighbors of those nodes to a queue until it searches all the nodes 
     */
    public static void main(String[] args) {

        BFSGraph graph = new BFSGraph(5);      
        
        graph.addNode(new BFSNode('A'));
        graph.addNode(new BFSNode('B'));
        graph.addNode(new BFSNode('C'));
        graph.addNode(new BFSNode('D'));
        graph.addNode(new BFSNode('E'));
    
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.breadthFirstSearch(4);
    }
}
