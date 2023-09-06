package Sorts.BubbleSort;

public class Bubble {
    public static void sort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int n = array.length;
        int temp = 0;
        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
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
