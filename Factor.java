package com.bridgelabz;

//  Factors
//  a. Desc -> Computes the prime factorization of N using brute force.
//  b. I/P -> Number to find the prime factors
//  c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//  d. O/P -> Print the prime factors of number N.

import java.util.Scanner;

public class Factor {
    public static void main(String[] args){
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scan.nextInt();
        for(int i = 2;i < number;i++) {
            while (number % i == 0) {
                System.out.println(i + "");
                number = number / i;
            }
        }
        if(number > 2){
            System.out.println(number);
        }
    }
}
