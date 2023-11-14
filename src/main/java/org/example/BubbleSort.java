package org.example;

import java.util.Arrays;

public class BubbleSort {

    private final int FIRST_POSITION_ARRAY_UNSORTED = 0;

    public void sort (int[] arr) {
        System.out.println();
        System.out.println("[BubbleSort]");

        boolean shouldSorted;

        do {
            shouldSorted = false;
            int index = FIRST_POSITION_ARRAY_UNSORTED;

            while (index < arr.length - 1) {
                int actual = arr[index];
                int next = arr[index + 1];

                if (actual > next) {
                    arr[index] = next;
                    arr[index + 1] = actual;

                    shouldSorted = true;
                }

                index++;
            }

        } while (shouldSorted);

        System.out.println(Arrays.toString(arr));
    }

}
