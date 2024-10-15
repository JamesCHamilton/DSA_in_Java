package Algorithms;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        /*
         * selection sort = search through an array and keep track of the min value
         * during each iteration. At the end of each iteration, we swap variables.
         *  
         *      Quadratic Time O(n^2)
         *      okay for small data sets
         *      BAD for large data sets
         */
        int[] array = {1,2,6,8,9,4,3,6,7};

        selectionSort(array);

        System.out.println(Arrays.toString(array));

    }

    private static void selectionSort(int[] array) {
        for(int i = 0 ; i< array.length; i++){
            int min = i;
            for (int j = i+1; j< array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
