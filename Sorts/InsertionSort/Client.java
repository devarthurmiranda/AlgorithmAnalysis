package Sorts.InsertionSort;

import ArchiveOpener.ArchiveOpener;

public class Client {
    public static void main(String[] args) {
        int[] array = ArchiveOpener.openOneHundredThousand();
        long startTime = System.currentTimeMillis();
        Insertion.sort(array);
        long endTime = System.currentTimeMillis();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nTime elapsed: " + (endTime - startTime) + "ms");
    }
    
}
