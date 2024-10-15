package Algorithms;
import java.util.*;
public class BubbleSort {
    /*
     * bubble sort = pairs of adjacent elements are compared, and the elements swapped
     * if they are not in order 
     * 
     *      Quadratic time O(n^2)
     *      okay-ish with small data sets
     *      BAD with large data sets
     */
    public static void main(String[] args) {
        int array[] = {9,6,2,5,4,0,3,7,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        
    }

    private static void bubbleSort(int[] array) {
        //if you want the array in reversed order than change the 
        //if(array[j] > array[j+1] to <)
        for (int i = 0; i < array.length -1; i++){
            for (int j = 0; j<array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
