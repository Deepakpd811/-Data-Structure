package Sorting;
// Problem Statement:

// A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
// Hint:
// Divide the array into two halves recursively.
// Sort both halves individually.
// Merge the sorted halves by comparing elements.

public class MergeSort {

    public static void mergeSort(int[] prices, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(prices, low, mid);
            mergeSort(prices, mid + 1, high);
            merge(prices, low, mid, high);
        }
    }

    public static void merge(int[] prices, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = low;
        int[] temp = new int[prices.length];

        while (i <= mid && j <= high) {
            if (prices[i] < prices[j]) {
                temp[k] = prices[i];
                i++;
            } else {
                temp[k] = prices[j];
                j++;
            }
            k++;
        }

        while (j <= high) {
            temp[k] = prices[j];
            j++;
            k++;
        }

        while (i <= mid) {
            temp[k] = prices[i];
            i++;
            k++;
        }

        for (int l = low; l <= high; l++) {
            prices[l] = temp[l];
        }

    }

    public static void main(String[] args) {

        int[] prices = { 15, 89, 55, 87, 95, 43, 48, 67 };

        mergeSort(prices, 0, prices.length - 1);

        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
    }

}
