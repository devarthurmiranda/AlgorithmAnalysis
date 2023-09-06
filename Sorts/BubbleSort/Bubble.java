package Sorts.BubbleSort;

public class Bubble {

    public static void sort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int n = array.length;
        int temp = 0;
        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) { // Will do n-1 FOR loops that will each do n-i-1 comparisons and maybe swaps

            swapped = false; // Flag to check if any swaps were made in the current iteration, if not, the array is sorted
            
            for (int j = 0; j < n - i - 1; j++) { // n-i-1 comparisons, because i elements will be already in place
                comparisons++; 
                if (array[j] > array[j + 1]) { // If the current element is greater than the next element, swap them
                    swaps++;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
}
