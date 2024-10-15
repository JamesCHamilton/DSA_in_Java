package Algorithms.DepthFirstSearch;

public class DFSMain {
    /*
     * DFS = a search algorithm for traversing a tree or graph data structure 
     * 1. Pick a route
     * 2. Keep going until you reach a dead end, or a previously visited node(adds each visited node to a stack)
     * 3. Backtrack to the Last node that has unvisited adjacent neighbors
     *      * Think of a 2d drawing maze but instead to constantly changing directions, you go in one direction until 
     * you hit a deadend and then backtrack to the last spot in which there were multiple paths and then pick a direction
     * and repeat until the end is found 
     * https://scipython.com/static/media/uploads/blog/df_maze/df_maze2.png
     *  
     * 
     */
    public static void main(String[] args) {
        DFSGraph graph = new DFSGraph(5);
            
            graph.addNode(new DFSNode('A'));
            graph.addNode(new DFSNode('B'));
            graph.addNode(new DFSNode('C'));
            graph.addNode(new DFSNode('D'));
            graph.addNode(new DFSNode('E'));
        
            graph.addEdge(0, 1);
            graph.addEdge(1, 2);
            graph.addEdge(2, 3);
            graph.addEdge(2, 4);
            graph.addEdge(4, 0);
            graph.addEdge(4, 2);

            graph.depthFirstSearch(3);
        }
    }
    
