package org.prep.bigO;

public class SpaceComplexityRecursive {


    /**
     * O(n) time and space complexity because of recursion
     * <p>
     * Each call adds a level to the stack.<br/>
     * 1 &emsp; -> sum(4)<br/>
     * 2 &emsp;&emsp;-> sum(3)<br/>
     * 3  &emsp;&emsp;&emsp;  -> sum(2)<br/>
     * 4  &emsp;&emsp;&emsp;&emsp;      -> sum(l)<br/>
     * 5   &emsp;&emsp;&emsp;&emsp;&emsp;         -> sum(0)<br/>
     * **/
    int sum(int n){
        if (n<=0) return 0;
        System.out.println("n="+n);
        return sum(n-1)+n;
    }

    /**
     * We have O(n) calls to pairSum here but our space complexity is O(1)
     * because those O(n) calls do not exist simultaneously on the call Stack, they exist independently, once a time
     * **/
    int pairSumSequence(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=pairSum(i,i+1);
        }
        return sum;
    }

     int pairSum(int a, int b) {
        return a + b;
    }

    /**
     * this is the scenario where we add runtimes : 0 ( A + B)
     * **/
    void addRuntimes(int[] arr1,int[] arr2){
        for(int a:arr1){
            print(a);
        }
        for(int b:arr2){
            print(b);
        }
    }

    /**
     * this is the scenario where we multiply runtimes: 0 (A* B)
     * **/
    void multiplyRuntimes(int[] arr1,int[] arr2){
        for(int a:arr1){
            for(int b:arr2){
                print(a + "," + b+" ");
            }
        }

    }

   <J> void print(J a){
        System.out.print(a+" ");
    }

    public static void main(String[] args) {
        SpaceComplexityRecursive obj = new SpaceComplexityRecursive();
//        System.out.println(obj.sum(4));
//        System.out.println(obj.pairSumSequence(5));
        obj.addRuntimes(new int[]{1,2,3,4},new int[]{1,2,3,4});
        obj.multiplyRuntimes(new int[]{1,2,3,4},new int[]{1,2,3,4});
    }
}
