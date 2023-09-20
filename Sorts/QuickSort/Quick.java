package Sorts.QuickSort;

public class Quick {
    public static void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int start, int end){
        // Stop the recursion when the pointers cross
        if (start >= end) return;

        // Divide the array in two parts
        int pivot = partition(array, start, end);

        // Call the sort method recursively for each side
        sort(array, start, pivot - 1);
        sort(array, pivot + 1, end);
    }

    public static int partition(int[] array, int start, int end){
        // The pivot is the last element of the array
        int pivot = array[end];
        
        int i = start - 1; // The index of the smaller element
        for(int j = start; j < end; j++){
            // If the current element is smaller than the pivot
            if(array[j] < pivot){
                i++;
                // Swap the elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap the pivot with the element in the index i + 1
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        // Return the index of the pivot
        return i + 1;
    }
}
