package Algorithms;
import java.util.*;

public class MergeSort {
    /*
     * merge sort = recursively divide array in 2, sort, re-combine
     * runtime complexity = O(n Log n )
     * space complexity = O(n)
     */
    public static void main(String[] args) {
        int[] array = {0,8,6,5,3,2,1,4,7,9};
        mergeSort(array);

        System.out.println(Arrays.toString(array));
       
    }

    private static void mergeSort(int[] array) {
        int lenght = array.length;
        if(lenght <= 1) return;//base case (when condition is forfilled it will stop)

        int middle = lenght/2;//shaves half off. therefore it is the left half portion that is left
        int[] leftArray = new int[middle];//setting size for left
        int[] rightArray = new int[lenght-middle];//setting size for right 

        int i = 0;// for left array
        int j = 0;// for right array

        for(; i<lenght; i++){
            if(i< middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[]array){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //union/sum types are a thing in java

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l]; 
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
