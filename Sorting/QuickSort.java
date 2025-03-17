package Sorting;

public class QuickSort {

    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[low];
        int i = low;
        int j = high;

        while (i < j) {

         
            while (prices[i] <= pivot && i <= high -1) { // i<=high-1 is important
                i++; // 
            }

            while (prices[j] > pivot && j >= low + 1) { // j>=low+1 is important
                j--;
            }

            if (i < j) {
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }

        }

        int temp = prices[low];
        prices[low] = prices[j]; // swap pivot to j index
        prices[j] = temp;

        return j;

    }

    public static void main(String[] args) {

        int[] prices = { 15, 89, 55, 87, 95, 43, 48, 67 };

        quickSort(prices, 0, prices.length - 1);

        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}
