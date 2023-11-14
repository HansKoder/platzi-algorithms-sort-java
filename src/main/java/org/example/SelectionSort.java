package org.example;

import java.util.Arrays;

public class SelectionSort {

    public void sort (int [] arr) {

        System.out.println();
        System.out.println("[SelectionSort]");

        for (int i = 0; i < arr.length; i++) {
            int placedIndexAsMinimum = i;
            int minimum = arr[i];

            int indexNextNumber = i + 1;

            while (indexNextNumber < arr.length) {
                if (minimum > arr[indexNextNumber]) {
                    placedIndexAsMinimum = indexNextNumber;
                    minimum = arr[indexNextNumber];
                }

                indexNextNumber++;
            }

            if (i != placedIndexAsMinimum) {
                arr[placedIndexAsMinimum] = arr[i];
                arr[i] = minimum;
            }

        }

        System.out.println(Arrays.toString(arr));
    }

}
