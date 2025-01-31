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

    public boolean findWithBinarySearchBoolean(long searchKey){
        int low=0;
        int high=nElems - 1;
        while(true){
            int mid = low + (high - low)/2;
            if (low>high){
                return false;
            }
            if (a[mid]==searchKey){
                return true;
            }else if(a[mid]>searchKey){
                high=mid-1;
            }else {
                low=mid +1;
            }
        }
    }




    public long removeMax(){
        long max=a[nElems-1];
        a[nElems-1]=0;
        nElems--;
        return max;
    }


    public long getMax(){
        return a.length == 0 ? -1 : a[nElems-1];
    }


    public int findWithBinarySearch(long searchKey){
        int low=0;
        int high=nElems-1;

        while(low <= high){
            int mid=low + (high-low)/2;

            if (a[mid]==searchKey){
                return mid;
            } else if (a[mid] > searchKey) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
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


    public int insertWithBinarySearch(long value){
        int low = 0;
        int high = nElems - 1;
        int targetIndex = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(a[mid]>value){
                high=mid-1;
            } else if (a[mid]<value) {
                low=mid+1;
                targetIndex=low;
            } else if (a[mid]==value) {
                break;
            }
        }

        for (int i = nElems; i > targetIndex; i--) {
            a[i]=a[i-1];
        }
        a[targetIndex]=value;
        nElems++;
        System.out.println("Element inserted: "+value);
        System.out.println("Target index: "+targetIndex);
        return low;
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
