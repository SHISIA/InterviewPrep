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
        bubbleSort.bubbleSort();
//        bubbleSort.display();
    }
}
