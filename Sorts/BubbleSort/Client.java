package Sorts.BubbleSort;

import ArchiveOpener.ArchiveOpener;

/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = ArchiveOpener.openTenThousand();
        Bubble.sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (endTime - startTime) + "ms");
    }
}