package Data_Structures.AdjacencyLists;
import java.util.*;



public class ListGraph {
    ArrayList<LinkedList<ListNode>> alist;
    
    int[][] matrix;

    ListGraph(){
        alist = new ArrayList<>();
    }
public void addNode(ListNode node){
    LinkedList<ListNode> currentList = new LinkedList<>();
    currentList.add(node);
    alist.add(currentList);

}
public void addEdge(int src, int dst){
    LinkedList<ListNode> currentList = alist.get(src);
    ListNode dstNode = alist.get(dst).get(0);
    currentList.add(dstNode);
}
public boolean checkEdge(int src, int dst){
    LinkedList<ListNode> currentList = alist.get(src);
    ListNode dstNode = alist.get(dst).get(0);

    for(ListNode node : currentList){
        if(node == dstNode){
            return true;
        }
    }return false;
   
}
public void printer(){
    for(LinkedList<ListNode> currentList : alist){
        for(ListNode node : currentList){
            System.out.print(node.data + " -> ");
        }
        System.out.println();
    }

    }
}
 

