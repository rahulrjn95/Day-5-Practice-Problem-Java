package com.bridgelabz;

//   Leap Year
//    a. I/P -> Year, ensure it is a 4 digit number.
//    b. Logic -> Determine if it is a Leap Year.
//    c. O/P -> Print the year is a Leap Year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("Enter an year:");
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Entered year is a leap year");
        }
        else{
            System.out.println("Entered year is not leap year");
        }
    }
}
