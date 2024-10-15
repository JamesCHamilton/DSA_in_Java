package Data_Structures;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
        /*
         * LinkedLists = stores Nodes in 2 parts (data + address)
         * Nodes are in non-consecutive memory locations
         * Elements are linked using pointers
         * 
         * Dynamic Data Structure (allocates needed memory while running)
         * 
         * uses:
         * - implement Stacks/Queues
         * - GPS navigation
         * - music platlists
         * 
         * Disadvantages:
         * - greater memory usage (additional pointers)
         * - No random access of elements (no index[i])
         * - Accessing/searching elements is more time consuming. O(n)
         * 
         * Advantages:
         * - Dynamuc Data Stucture 
         * - Insertion and Deletion of Nodes is easy. O(1)
         * - No/Low memory waste
         */
        LinkedList<String> linkedList = new LinkedList<String>();
        
        linkedList.push("A");
        linkedList.push("V");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.pop();
        System.out.println(linkedList);

        //LinkedList as a queue
        linkedList.add("T");
        System.out.println(linkedList);
        linkedList.remove("F");
        System.out.println(linkedList);


        linkedList.addLast("Z");
        linkedList.addFirst("First");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
    }
    
}