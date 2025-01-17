package org.prep;

public class ArraysPrep {


    public static void main(String[] args){
        String[] cars={"Camaro","Corvette","BMW","Tesla","Fisker","Ford Mustang"};
        ArraysPrep ap=new ArraysPrep();
        ap.printArrayPositions(cars);
    }

    private void printArrayPositions(String[] arr){
        System.out.println(arr.length); //length of the array
        System.out.println(arr[0]);//first element
        System.out.println(arr[1]);//second element
        System.out.println(arr[arr.length-1]);//last element
    }
}
