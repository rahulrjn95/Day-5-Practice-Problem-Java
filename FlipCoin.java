package com.bridgelabz;

//  1. Flip Coin and print percentage of Heads and Tails
//     a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//     b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
//     c. O/P -> Percentage of Head vs Tails

public class FlipCoin {
    public static void main(String[] args){
        double random = Math.random();
        System.out.println(random);
        if(random < 0.5){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
