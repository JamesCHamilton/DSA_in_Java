package Data_Structures;
import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayListsAndLinkedLists {
    /*
     * Accessing an element in an arrayList is always faster than doing it from a LinkedList due to the fact that arrayList have random
     * access to elements compared to a LinkedList in which you have to start at one end and go through each corresponding node to get 
     * to the one you want
     * 
     * 
     */

    public static long LinkedListTime(LinkedList<Integer> linkedList){
         long startTime;
                long endTime;
                long elapsedTime;
        
                for(int i = 0; i < 1_000_000; i++){
                    linkedList.add(i);
        
                }
        
                startTime = System.nanoTime();
                //linkedList.get(0);
                //linkedList.get(500_000);
                //linkedList.remove(0);
                linkedList.remove(500_000);
                endTime = System.nanoTime();
                elapsedTime = endTime- startTime;
                return elapsedTime;
    }
    public static long ArrayListTime(ArrayList<Integer> arrayList ){
        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1_000_000; i++){
            arrayList.add(i);

        }

        startTime = System.nanoTime();
        //arrayList.get(0);
        //arrayList.get(500_000);
        //arrayList.remove(0);
        arrayList.remove(500_000);
        endTime = System.nanoTime();
        elapsedTime = endTime- startTime;
        return elapsedTime;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(); 

        System.out.println("LinkedList\t" + LinkedListTime(linkedList) + " ns");
        System.out.println("ArrayList\t" + ArrayListTime(arrayList) + " ns");

       

    }
}
