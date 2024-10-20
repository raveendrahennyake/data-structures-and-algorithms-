package org.example;
public class App {
    public static void main(String[] args) {
        int [] arr={64, 34, 25, 12, 22, 11, 90};
//        BubbleSort arrs=new BubbleSort();
//        arrs.bubbleSort(arr);
//        arrs.printArray(arr);

        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);  // Sort the array
        qs.printArray(arr);  // Print the sorted array




    }


}

