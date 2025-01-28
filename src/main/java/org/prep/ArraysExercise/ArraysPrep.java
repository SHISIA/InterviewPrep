package org.prep.ArraysExercise;


import java.util.Arrays;

/**
 * @Type: <b>Array:</b>
 * @Definition: An array is a collection of items of the same object type called Data type
 * **/
public class ArraysPrep {

    private void printArrayPositions(String[] arr){
        System.out.println(arr.length); //length of the array
        System.out.println(arr[0]);//first element
        System.out.println(arr[1]);//second element
        System.out.println(arr[arr.length-1]);//last element
        System.out.println(Arrays.toString(arr));
    }

    private void assignArrayValues(String[] arr){
        arr[0]="Mazda";//sets the first item value to Mazda
        arr[1]="Mercedes";//sets the second item value to Mercedes
        arr[2]="Volkswagen";//sets the third array item value to Volkswagen
        arr[arr.length-1]="Mahindra";//sets the last array item value to Mahindra
        System.out.println(Arrays.toString(arr));//converts the array values into a printable string

    }

    /***
     * <b>Anonymous Array: </b>An array in Java without any name is known as an anonymous array. It is an array just for creating and using instantly.
     * Using an anonymous array, we can pass an array with user values without the referenced variable.
     * <a href="https://www.geeksforgeeks.org/anonymous-array-java/">Click to learn more about anonymous arrays</a>
     * **/
    private void anonymousArray(){
        System.out.println(Arrays.toString(new String[10]));//prints [null,null,null....ten times]
        System.out.println(Arrays.toString(new String[0]));//prints []
        System.out.println(Arrays.toString(new String[]{"shisia","James","Peter","Paula"}));//prints [shisia,James,Peter,Paula]
    }


    private void sortArray(String[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void twoDimensionalArray(String[][] arr){
        System.out.println(Arrays.toString(arr[0]));//prints the first item in the array , that is the first array in the  2d array
        System.out.println(Arrays.toString(arr[1]));//prints the second item in the array , that is the second array in the  2d array
        System.out.println(arr[0][0]);//print first element of the first array (first element in the 2D array)
        System.out.println(arr[1][0]);//prints first element of the second array (first element in the 2D array)
        System.out.println(arr[0][1]);//prints second element of the first array (first element in the 2D array)
        System.out.println(arr[1][1]);//prints second element of the second array (first element in the 2D array)
        System.out.println(Arrays.toString(arr[0])+" "+Arrays.toString(arr[1]));
    }

    private void searchInArray(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                System.out.println("Found: " + target + " at index " + i);
                break;

            }
            if (i == arr.length - 1) {
                System.out.println("Cannot find " + target);
            }


        }
    }


    private void deleteItemFromArray(String[] arr, String target) {
        for (int i = 0; i< arr.length; i++){
            if(arr[i].equals(target)){
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1]=null;
                break;
            }

        }
    }

    private void printArray(String[] arr){
        for (String s : arr) {
            System.out.print(s+" ");
        }
    }

    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvette", "BMW", "Tesla", "Fisker", "Ford Mustang"};
        ArraysPrep ap = new ArraysPrep();
//        ap.printArrayPositions(cars);
//        ap.assignArrayValues(cars);
//        ap.anonymousArray();
//        ap.sortArray(cars);
//        ap.twoDimensionalArray(new String[][]{{"Man","Woman"},{"Daughter","Son"}});
        ap.searchInArray(cars, "Corvette");
        ap.deleteItemFromArray(cars, "Corvette");
        ap.printArray(cars);
    }

}
