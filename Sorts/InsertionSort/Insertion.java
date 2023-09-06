package Sorts.InsertionSort;

public class Insertion {

    public static void sort(int[] array){
        int comparisons = 0;
        int swaps = 0;
        int n = array.length;
        int temp = 0;
        int j = 0;
        for(int i = 1; i < n; i++){ // Iterates through the array, starting at the second element

            temp = array[i]; // Stores the current element in a temporary variable
            
            j = i - 1;
            while(j >= 0 && array[j] > temp){ // While the previous element is greater than the element on temporary variable
                comparisons++;
                swaps++;
                array[j + 1] = array[j]; // Set the current element to the previous element
                j--; // Look at the previous position
            }
            array[j + 1] = temp; // Set the current position the value of the temporary variable
        }
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
    
}
