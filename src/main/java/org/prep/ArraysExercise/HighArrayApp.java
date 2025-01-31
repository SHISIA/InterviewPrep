package org.prep.ArraysExercise;

import java.util.Arrays;

public class HighArrayApp {
    public static void main(String[] args) {
        HighArrayInterface array=new HighArrayInterface(20);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);
        array.insert(70);
        array.insert(80);
        array.insert(90);
        array.insert(100);
        array.insert(200);
        array.insert(300);

        array.print();
        System.out.println("Maximum element index is: "+array.findWithBinarySearch(array.getMax()));
        long[] newArray = new long[20];
        int len = array.findWithBinarySearch(array.getMax());
        for (int i = 0; i <= len; i++) {
            newArray[i] = array.removeMax();
            System.out.println("Added : "+newArray[i]+" to the index : "+i);
        }
        System.out.println(Arrays.toString(newArray));
    }
}
