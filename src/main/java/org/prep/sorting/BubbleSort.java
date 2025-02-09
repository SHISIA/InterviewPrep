package org.prep.sorting;

public class BubbleSort {


    private long[] array;
    private int elements;

    public BubbleSort(int size){
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
        System.out.println("size "+elements);
        System.out.println();
    }

    private void bubbleSort(){
        int out, in;
        for(out=elements-1;out>1;out--){
            for (in=0;in<out;in++){
                if(array[in]>array[in+1]){
                    swap(in,in+1);
                }
            }
        }
        display();
    }

    void bubbleSortFast() {
        boolean swapped;
        for (int out = elements - 1; out > 1; out--) {
            swapped = false;
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                    swapped = true;
                }
            }
            if (!swapped) break; // Exit early if no swaps were made
        }
        display();
    }

    /**Why is this faster? Because it avoids unnecessary iterations if the array is already sorted***/
    void bubbleSortFastFast() {
        boolean swapped;
        do{
            swapped=false;
            for(int i=0;i<elements-1;i++){
                if(array[i]>array[i+1]){
                    swap(i,i+1);
                    swapped=true;
                }
            }
        }while (swapped);
        display();
    }


    private void swap(int a, int b){
        long temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort(10);
        bubbleSort.insert(40);
        bubbleSort.insert(10);
        bubbleSort.insert(30);
        bubbleSort.insert(20);
        bubbleSort.insert(70);
        bubbleSort.insert(24);
        bubbleSort.bubbleSortFastFast();
//        bubbleSort.display();
    }
}
