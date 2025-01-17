package org.prep;


import java.util.Arrays;

/**
 * @Type: <b>Array:</b>
 * @Definition: An array is a collection of items of the same object type called Data type
 * **/
public class ArraysPrep {


    public static void main(String[] args){
        String[] cars={"Camaro","Corvette","BMW","Tesla","Fisker","Ford Mustang"};
        ArraysPrep ap=new ArraysPrep();
        ap.printArrayPositions(cars);
        ap.assignArrayValues(cars);
    }

    private void printArrayPositions(String[] arr){
        System.out.println(arr.length); //length of the array
        System.out.println(arr[0]);//first element
        System.out.println(arr[1]);//second element
        System.out.println(arr[arr.length-1]);//last element
    }

    private void assignArrayValues(String[] arr){
        arr[0]="Mazda";//sets the first item value to Mazda
        arr[1]="Mercedes";//sets the second item value to Mercedes
        arr[2]="Volkswagen";//sets the third array item value to Volkswagen
        arr[arr.length-1]="Mahindra";//sets the last array item value to Mahindra
        System.out.println(Arrays.toString(arr));//converts the array values into a printable string
    }
}
