package Sorting;
// 5. Selection Sort - Sort Exam Scores
// Problem Statement:
// A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
// Hint:
// Find the minimum element in the array.
// Swap it with the first unsorted element.
// Repeat the process for the remaining elements.

public class SelectionSort {

    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        
       
        int[] scores = { 89, 78, 96, 65, 87, 92, 110, 56 };
        selectionSort(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

    }
}
