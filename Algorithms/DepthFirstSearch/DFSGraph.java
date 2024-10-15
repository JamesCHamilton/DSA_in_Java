package Algorithms.DepthFirstSearch;

import java.util.ArrayList;

public class DFSGraph {
    
    ArrayList<DFSNode> nodes;
    int[][] matrix;

    DFSGraph(int size){
            matrix = new int[size][size];
            nodes = new ArrayList<>();
            
        }
    public void addNode(DFSNode node){
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
        public void depthFirstSearch(int src){
            boolean[] visited = new boolean[matrix.length];
            dfsHelper(src, visited);
        }       
        public void dfsHelper(int src, boolean[] visited){
            if(visited[src]){
                return;
            }else{
                visited[src] = true;
                System.out.println(nodes.get(src).data + " = visited");
            }

            for(int i = 0 ; i<matrix[src].length; i++){
                if(matrix[src][i] == 1){
                    dfsHelper(i, visited);
                }
            }
            return;
        }
    }
