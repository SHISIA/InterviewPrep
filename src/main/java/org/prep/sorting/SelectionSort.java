package org.prep.sorting;

public class SelectionSort {

    private final long[] array;
    private int elements;

    public SelectionSort(int size){
        array=new long[size];
        elements=0;
    }

    private void insert(long newValue){
        if (elements>=array.length){
            return;
        }
        array[elements++]=newValue;
    }

    private void display(){
        for (long value: array){
            System.out.print(value+" ");
        }
        System.out.println();
    }

    private void selectionSort() {
        for (int start = 0; start < array.length - 1; start++) {
            int minIndex = start;  // Reset minIndex for the new pass

            // Find the minimum element in the remaining array
            for (int i = start + 1; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i; // Update the index of the new minimum
                }
            }

            // Swap the found minimum with the first element of the unsorted section
            if (minIndex != start) {
                long temp = array[start];
                array[start] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        display(); // Display the sorted array

    }

    private void swap(int a, int b){
        long temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    private void selectionSortV2(){
        for(int i=0;i<array.length-1;i++){
            int minIndex = i;
            long minValue = array[i];
            for(int j=i+1;j<array.length;j++){
                if (array[j]<minValue){
                    minValue = array[j];
                    swap(minIndex,j);
                }
            }
        }
        display();
    }

    public static void main(String [] args) {
        SelectionSort selectionSort=new SelectionSort(10);
        selectionSort.insert(40);
        selectionSort.insert(10);
        selectionSort.insert(30);
        selectionSort.insert(20);
        selectionSort.insert(70);
        selectionSort.insert(24);
        selectionSort.selectionSortV2();
    }
}
