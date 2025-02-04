package org.prep.ArraysExercise;

public class OrderedArray {
    public static void main(String[] args) {
        HighArrayInterface array = new HighArrayInterface(20);
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

        array.deleteByBinarySearch(70);
        array.deleteByBinarySearch(80);
        array.deleteByBinarySearch(1000);
    }
}
