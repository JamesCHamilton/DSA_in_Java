package Algorithms;
import java.util.*;

public class InsertionSort {
    /*
     * insertion sort = after comparing elements to the left (starting at the one more than the starting index)
     * shift elements to the right to make roomto insert a value
     * 
     *      Quadratic time O(n^2)
     *      small data set = decent
     *      large data set = BAD
     * 
     *      Less steps than Bubble Sort
     *      Best case is O(n) compared to Selection Sort O(n^2)
     */
    public static void main(String[] args) {
        int array[] = {9,7,3,5,6,1,5,4,0,2};

        insertionSort(array);
        
        System.out.println(Arrays.toString(array));
        
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i< array.length; i++){
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
