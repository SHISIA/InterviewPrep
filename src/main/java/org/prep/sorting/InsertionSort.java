package org.prep.sorting;

/**Has O(N^2) time complexity***/
public class InsertionSort {

    private final long[] array;
    private int elements;

    public InsertionSort(int size){
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

    private void insertionSort() {
         for (int i = 1; i < elements; i++) {
            long temp=array[i];
            int insertionIndex=i;
            while (insertionIndex>0 && array[insertionIndex-1]>=temp){
               array[insertionIndex]=array[insertionIndex-1];
              --insertionIndex;
            }
            array[insertionIndex]=temp;
        }
        display();
    }

    public static void main(String[] args) {
        InsertionSort sort=new InsertionSort(10);
        sort.insert(10);
        sort.insert(0);
        sort.insert(0);
        sort.insert(5);
        sort.insert(20);
        sort.insert(60);
        sort.insert(70);
        sort.insert(80);
        sort.insert(30);
        sort.insert(40);
        sort.insert(50);
        sort.insertionSort();
    }



}
