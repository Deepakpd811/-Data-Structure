package Sorting;

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);  // build heap
        }

        for (int i = n - 1; i > 0; i--) {// swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n , int i){
        int largest = i;
        int left = 2 * i+1;
        int right = 2 * i+2 ;
        
        if(left<n && arr[left]>arr[largest]){// find largest element
            largest = left;
        }else if (right<n && arr[right]>arr[largest]){// find largest element
            largest = right;
        }

        if(largest!=i){ // swap largest element with root
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest); // heapify the re
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {15, 89, 55, 87, 95, 43, 48, 67};

        heapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
