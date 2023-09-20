package Sorts.BubbleSort;

import ArchiveOpener.ArchiveOpener;

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        int[] array = ArchiveOpener.openOneHundredThousand();
        long startTime = System.currentTimeMillis();
        Bubble.sort(array);
        long endTime = System.currentTimeMillis();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nTime elapsed: " + (endTime - startTime) + "ms");
    }
}