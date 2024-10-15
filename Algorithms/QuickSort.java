package Algorithms;
import java.util.*;

public class QuickSort {
    /*
     * QuickSort = moves smaller elements to the left of a pivot
     * recursively divide array in 2 partitions
     * 
     * run-time complexity = Best case O(n log(n))
     *                       Average case O(n log(n))
     *                       Worst case O(n^2) if already sorted
     * 
     * space complexity = O(log(n)) due to recursion
     */
    public static void main(String[] args) {
        int[] array = {0,8,6,5,3,2,1,4,7,9};
        quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array, int start, int end) {
       if (end <= start) return;//base case

       int pivot = partition(array, start, end);
       quickSort(array, start, pivot-1);
       quickSort(array, pivot+1, end);
    }
    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start -1;

        for(int j = start; j <= end; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
