package SortingAlgorithms;

public class InsertionSort {

    void insertionSort(int arr[]) {
        int n = arr.length;
        int key;
        int j;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort ob = new InsertionSort();
        System.out.println("UnSorted array");
        
        printArray(arr);

        ob.insertionSort(arr);
        System.out.println("Sorted array");
      
        printArray(arr);
    }
}
