package com.assignment1;
// Find the power of 2 using Recursion. Also take the input from the user.

import java.util.Scanner;

public class Question2 {
    public static int PowerOf2(int n){
        if(n==0)
            return 1;
        else
            return 2*PowerOf2(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The power of 2 raised to " + n + " is " + PowerOf2(n));
    }
}
