package org.prep.ArraysExercise;

public class RemoveDups {
    public static void main(String[] args) {
        long[] arr = {1,5,7,12,17,17,17,17,20,20};
        removeDups(arr);
    }

    private static void removeDups(long[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    break;
                }
            }
        }

        long[] newArr = new long[arr.length];
        int index = 0;
        for (long l : arr) {
            if (l != 0) {
                newArr[index++] = l;
            }
        }
        printArray(arr);
        System.out.println();
        printArray(newArr);
    }

    private static void printArray(long[] arr) {
        for (long l : arr) {
            System.out.print(l + " ");
        }
    }
}
