package Sorting;


// Problem Statement:
// A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
// Hint:
// Divide the array into sorted and unsorted parts.
// Pick an element from the unsorted part and insert it into its correct position in the sorted part.
// Repeat for all elements.



public class InsertionSort {

    public static int[] insertionSort(int[] empId){
       
        for(int i=1; i<empId.length; i++){
            int k = empId[i];
            int j=i-1;

            while(j>=0 && empId[j]>k){
                empId[j+1] = empId[j];
                
                j--;
            }

            empId[j+1] = k;

        }
        return empId;
    }

    public static void main(String[] args) {
        
       int[] empId = {101,103,104,107,102,105,106};

        int[] sortedEmpId = insertionSort(empId);

        for(int i=0; i<empId.length; i++){
            System.out.print(sortedEmpId[i]+ " ");
        }

       

    }
}
