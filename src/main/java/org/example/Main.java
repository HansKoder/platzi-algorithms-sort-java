package org.example;

public class Main {
    public static void main(String[] args) {

        int[] unSortedBubbleSort =  {190, 1200, 1, 2, 4, 55, 1000, 6, 800};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(unSortedBubbleSort);

        int[] unSortedInsertionSort =  {190, 1200, 1, 2, 4, 55, 1000, 6, 800};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(unSortedInsertionSort);

    }
}