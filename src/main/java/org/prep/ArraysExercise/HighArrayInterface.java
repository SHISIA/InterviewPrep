package org.prep.ArraysExercise;

public class HighArrayInterface {
    private final long[] a;
    private int nElems;

    public HighArrayInterface(int max) {
        a= new long[max];
        nElems=0;
    }

    public boolean find(long searchKey){
        for(int i=0;i<nElems;i++){
            if(a[i]==searchKey){
                return true;
            }
            if (i==nElems-1){
                System.out.println("Element found");
                return false;
            }
        }
        return false;
    }


    public long getMax(){
        return a.length == 0 ? -1 : a[nElems-1];
    }


    public int findWithBinarySearch(long searchKey){
        int low=0;
        int high=a.length-1;

        while(true){
            int mid=low + (high-low)/2;

            if (a[mid]==searchKey){
                return mid;
            } else if (a[mid] > searchKey) {
                high=mid-1;
            }else {
                low=mid+1;
            }

            if (low>high){
                return -1;
            }

        }
    }

    public boolean insert(long value){
        if (a.length==nElems) {
            System.out.println("Array is full");
            return false;
        }
        a[nElems]=value;
        nElems++;
        return true;
    }

    public boolean delete(long value){
        if (!find(value)) {
            return false;
        }
        for(int i=0;i<nElems;i++){
            if(a[i]==value){
                for(int j=i;j<nElems;j++){
                    a[j]=a[j+1];
                }
                a[nElems-1]=0;
                nElems--;
                return true;
            }
        }
        return true;
    }

    public void print(){
        for (long i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
