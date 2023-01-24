// Find the sum of natural numbers using recursion and for loop
package com.assignment1;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Question4 {
    //Using Loop
    public static int SumWithLoop(int n){
        int sum = 0;
        for(int i =1; i<=n; i++ ){
            sum+=i;
        }
        return sum;
    }
    //Using Recursion
    public static int SumWRecursion(int n){
        if(n==1) return 1;
        return n + SumWRecursion(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The sum of " + n + " natural numbers using for loop is : " + SumWithLoop(n));
        System.out.println("The sum of " + n + " natural numbers using recursion is : " + SumWRecursion(n));
    }
}
