package Data_Structures;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        /*
         * Priority Queue = A FIFO data structure that serves
         * elements with the highest priorities first before elements with lower priority
         *  Uses the elements value to order 
         */

         Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

         queue.offer(2.2);
         queue.offer(5.5);
         queue.offer(6.4);
         queue.offer(8.7);
         queue.offer(90.0);

         while(!queue.isEmpty()){
            System.out.println(queue.poll());
         }
         
    }
}
