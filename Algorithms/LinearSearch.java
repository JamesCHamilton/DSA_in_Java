package Algorithms;
public class LinearSearch {
    public static void main(String[] args) {
        /*
         * linear search = Iterate through a collection, one element at a time
         * 
         * runtime complexity: O(n)
         * 
         * Disadvantages:
         *      Slow for large data sets
         * Advantages:
         *      Fast for searches of small to medium data sets
         *      Does not need to be sorted (like in binary search)
         *      Useful for data structures that do not have random access (Linked List)
         * 
         */
        int[] array = {0,7,2,3,6,8,2,6,9,2,1,33,77,36};
        int index = linearSearch(array, 1);
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found");
        }

    }
    private static int linearSearch(int[] array, int value){
        for(int i = 0; i< array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
