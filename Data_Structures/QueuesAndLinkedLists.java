package Data_Structures;
import java.util.Queue;
import java.util.LinkedList;
public class QueuesAndLinkedLists {
    public static void main(String[] args) {
        /*
         * Queue = FIFO data structure (First-in First-out)
         * A collection designed for holding elements prior to processing 
         * Linear data structure
         * 
         * add = enqueue, offer()
         * remove = dequeue, poll()
         * 
         *  to create a new Queue a LinkedList has to be made
         *
         * Uses for Queues:
         * - Keyboard buffer (letters should appear on the screen in the order they are pressed)
         * - Printer Queue (Print jobs should be completed in order)
         * - Used in LinkedLists, PriorityQueues, Breadth-frist searach
         */

         Queue<String> queue = new LinkedList<String>();

         queue.offer("John");
         queue.offer("Luis");
         queue.offer("James");
         queue.offer("Elijah");
         queue.offer("Tom");

         System.out.println(queue.size());
         System.out.println(queue);
         System.out.println(queue.peek());

         queue.poll();
         queue.poll();
         queue.poll();
         queue.poll();

         System.out.println(queue.peek());
         System.out.println(queue);
         System.out.println(queue.size());
         
        
        
         };
    }

