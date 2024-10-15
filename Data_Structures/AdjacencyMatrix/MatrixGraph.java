package Data_Structures.AdjacencyMatrix;

import java.util.ArrayList;

public class MatrixGraph {
    ArrayList<MatrixNode> nodes;
    
    int[][] matrix;

    MatrixGraph(int size){
        matrix = new int[size][size];
        nodes = new ArrayList<>();
        
    }
public void addNode(MatrixNode node){
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
public void printer(){

    System.out.print("  ");
    for(MatrixNode node : nodes){
        System.out.print(node.data + " ");
    }
    System.out.println();
    
    for(int i = 0 ; i<matrix.length; i++){
        System.out.print(nodes.get(i).data + " ");
        for(int j = 0; j<matrix[i].length; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();

    }
}
}   

