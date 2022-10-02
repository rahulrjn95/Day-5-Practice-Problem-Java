package com.bridgelabz;

//  Harmonic Number
//  a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//     (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//  b. I/P -> The Harmonic Value N. Ensure N != 0
//  c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//  d. O/P -> Print the Nth Harmonic Value.

public class HarmonicNumber {
    static double nthHarmonic(int N) {
        float harmonic = 1;
        for (int i = 2; i <= N; i++) {
            harmonic += (float) 1 / i;
        }
        return harmonic;
    }
    public static void main(String[] args){
        int N = 8;
        System.out.println(nthHarmonic(N));
    }
}
