package org.prep.bigO;

import java.math.BigInteger;

public class CrackingTheCodingInterviewChapterIV_BigO {


    private BigInteger factorial(int no){
        if (no<0){
            return BigInteger.valueOf(-1);
        }else if (no==0){
            return BigInteger.ONE;
        }else{
            return BigInteger.valueOf(no).multiply(factorial(no-1));
        }
    }

    /**
     * finds the nth fibonacci number
     * Technically it has O(2^n) but deep in observation it has O(1.6^n)
     * because it down the stack there's sometimes one call
     **/
    int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    /**
     * prints the powers of 2 from 1 to n inclusive
     ***/
    int powerOf2(int number) {
        if (number < 1) {
            return 0;
        } else if (number == 1) {
            System.out.println(1);
            return 1;
        } else {
            int previous = powerOf2(number / 2);
            int current = previous * 2;
            System.out.println(current);
            return current;
        }
    }

    int product(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum +=a;
        }
        return sum;
    }

    public static void main(String[] args) {
        CrackingTheCodingInterviewChapterIV_BigO chapterIVBigO = new CrackingTheCodingInterviewChapterIV_BigO();
//        System.out.println(chapterIVBigO.factorial(1));
//        System.out.println(chapterIVBigO.fibonacci(1));
//        chapterIVBigO.powerOf2(4);
        System.out.println(chapterIVBigO.product(4, 4));
    }
    
}
