package Sorts.InsertionSort;

public class Insertion {

    public static void sort(int[] array){
        int comparisons = 0;
        int swaps = 0;
        int n = array.length;
        int temp = 0;
        int j = 0;
        for(int i = 1; i < n; i++){
            temp = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > temp){
                comparisons++;
                swaps++;
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
    }
    
}
