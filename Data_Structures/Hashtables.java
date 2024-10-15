package Data_Structures;
import java.util.*;
public class Hashtables {
    public static void main(String[] args) {
        /*
         * Hashtable = A data structure that stores unique keys to value Ex: <Integer, String>
         * Each key/value pair is known as an Entry 
         * Fast insertion, look up, deletion of key/value pairs
         * Not ideal for small data sets, great with large data sets
         * 
         * hashing = takes a key and computes an integer (formula will  vary based on key & data type)
         *      In a Hashtable, we use the hash % capacity to calculate an index number 
         *       
         * index of the value in the hash = key.hashcode() % capacity 
         * it uses modular division so the index is based on the remainder from the division 
         * Ex: 
         *      key = 100 ,value = "grsgrg" 
         *      key = 101 , value = "grnogorbgirg"
         *      key.hascode() % 10
         *      100 % 10 = 0 ( 0 remainder) so it goes in the 0 index of the hashtable
         *      101 % 10 = 1 (1 remainder) so it goes in the 1 index of the hashtable 
         * 
         * bucket = an indexed storage location for one or more Entries
         *      can store multiple Entries in case of a collision (linked similarly a LinkedList) (one index can hold multiple values)
         * collision = hash function generates the same index for more than one key 
         * less collisions = more efficieny 
         * 
         * Runtime complexity: Best case - O(1)
         *                      Worst Case O(n)
         */
        Hashtable<String, String> table = new Hashtable<>(10);
        table.put("100", "DiddyBob");
        table.put("123", "Diddyrick");
        table.put("321", "Diddy");
        table.put("555", "DiddyGary");
        table.put("777", "DiddyCheeks");
        

        //table.remove(777);
        for(String key : table.keySet()){
            System.out.println(key.hashCode()%21 + "\t" + key + "\t" + table.get(key));
        }

    }
}
