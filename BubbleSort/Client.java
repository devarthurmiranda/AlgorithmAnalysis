package BubbleSort;

import ArchiveOpener.ArchiveOpener;

/**
 * Client
 */
public class Client {

    public static void sort(int[] array) {
        int comparisons = 0;
        int swaps = 0;
        int n = array.length;
        int temp = 0;

    }

    public static void main(String[] args) {
        int[] array = ArchiveOpener.openTenThousand();
        sort(array);
    }
}