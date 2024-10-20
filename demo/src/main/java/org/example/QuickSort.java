package org.example;
public class QuickSort {
    int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    // The main function that implements QuickSort
    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1); // Left subarray
            quickSort(arr, pi + 1, high); // Right subarray
        }
    }

    // Method to print the array
    void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
