package Algorithms.BreadthFirstSearch;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class BFSGraph {
    ArrayList<BFSNode> nodes;
        int[][] matrix;
    
    BFSGraph(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();
                
        }

    public void addNode(BFSNode node){
        nodes.add(node);
    }

    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        
        if(matrix[src][dst] == 1){
            return true;
        }else return false;
    }

    public void breadthFirstSearch(int src){

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0 ){
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            for(int i = 0; i< matrix[src].length; i++){
                if(matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
