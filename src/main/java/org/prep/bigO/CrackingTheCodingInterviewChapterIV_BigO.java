package org.prep.bigO;

import java.math.BigInteger;

public class CrackingTheCodingInterviewChapterIV_BigO {
    public static void main(String[] args) {
        CrackingTheCodingInterviewChapterIV_BigO chapterIVBigO = new CrackingTheCodingInterviewChapterIV_BigO();
        System.out.println(chapterIVBigO.factorial(100));
    }

    private BigInteger factorial(int no){
        if (no<0){
            return BigInteger.valueOf(-1);
        }else if (no==0){
            return BigInteger.ONE;
        }else{
            return BigInteger.valueOf(no).multiply(factorial(no-1));
        }
    }
}
