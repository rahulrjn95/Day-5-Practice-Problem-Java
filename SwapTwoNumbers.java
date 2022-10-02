package com.bridgelabz;

//  Java Program to Swap Two Numbers

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("before swapping numbers:" +a+ " " + b);
        //swapping
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping:" +a+ " " + b);
        System.out.println();
    }
}
