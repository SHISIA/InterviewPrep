package org.prep.bigO;

public class CheckIfPrimeNumber {
    public static void main(String[] args) {
        CheckIfPrimeNumber primeNumber = new CheckIfPrimeNumber();
        int n = 10;
//        System.out.println("number:"+n+" "+primeNumber.isPrime(n));
        n = 37;
        System.out.println("number:" + n + " " + primeNumber.isPrime(n));
    }

    /**
     * checks for prime numbers
     * Runs with time complexity of O(√n)
     * ***/
    boolean isPrime(int number) {
        for (int x = 2; x * x <= number; x++) {
            System.out.println("x:" + x + "\tx * x:" + (x * x));
            if (number % x == 0) {
                return false;
            }
        }

        return true;
    }
}
