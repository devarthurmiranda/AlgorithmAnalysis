package Sorts.MergeSort;

public class Merge {

    public static void sort(int[] array){
        int n = array.length;
        // It will stop the recursion when the array is divided into single elements
        if (n < 2) return;

        // Divide the array in half
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Copy the elements from the array to the left and right arrays
        for(int i = 0; i < mid; i++){
            left[i] = array[i];
        }
        for(int i = mid; i < n; i++){
            right[i - mid] = array[i];
        }

        // Call the sort method recursively for each side
        sort(left);
        sort(right);

        // Merge the sorted arrays
        merge(array, left, right);
    }
    public static void merge(int[] array, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        // Compare the elements from the left and right arrays and add the smallest to the array
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        // Add the remaining elements from the left and right arrays case one of them is empty
        while(i < left.length){
            array[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            array[k] = right[j];
            j++;
            k++;
        }
    }

}
