package Sorting;


// Problem Statement:
// A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
// Hint:
// Traverse through the array multiple times.
// Compare adjacent elements and swap if needed.
// Repeat the process until no swaps are required.


public class BubbleSort {

    public static int[] bubbleSort(int[] marks){
        
        for(int i=0; i<marks.length; i++){
            boolean swap = false;
            for(int j=i+1; j<marks.length; j++){
                if(marks[i]>marks[j] ){
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                    swap = true;
                }
                if(!swap) break;
            }
        }
        return marks;
    }

    public static void main(String[] args) {
        
        int[] marks = {15,89,55,87,95,43,48,67};

        int[] sortedMarks = bubbleSort(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(sortedMarks[i]+ " ");
        }

    }
}
