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


    public void deleteByBinarySearch(long searchKey){
        int targetIndex = findWithBinarySearch(searchKey);
        if(targetIndex==-1){
            System.out.println("Element not found");
            return;
        }
        //shift elements to the empty space
        for (int i = targetIndex; i < a.length-1; i++) {
            a[i]=a[i+1];
        }
        nElems--;
        print();
    }


    public void print(){
        for (long i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public void merge(long[] arr1, long[] arr2){
        long[] newArray=new long[arr1.length+arr2.length];
        System.out.println(arr1.length+" "+arr2.length);
        int totalElements=0;

        for(int i=0;i<arr1.length;i++){
            newArray[i]=arr1[i];
            totalElements++;
        }

        for (long item : arr2) {
            int position=itemOrReturnLow(newArray,item,totalElements);
            if (position!=-1) {

                for(int i=totalElements;i>position;i--){
                    newArray[i]=newArray[i-1];
                }
                newArray[position]=item;
                totalElements++;
            }
        }
        for (long i:newArray) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public int itemOrReturnLow(long[] newArray, long target, int totalElements){
        int low=0;
        int high=totalElements-1;
        while (low <= high) {
            int mid=low + (high-low)/2;
            if(newArray[mid]<target){
                low=mid+1;
            }else if(newArray[mid]>target){
                high=mid-1;
            }else {
                return -1;
            }
        }
        return low;
    }
}
