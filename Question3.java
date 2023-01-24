// Take the input from the user and find the term of the fibonacci series using recursion and for loop

package com.assignment1;

import java.util.Scanner;

public class Question3 {

    public static int RecursionFib(int n){
        if(n==1)
            return 0;
        if (n==2) {
            return 1;
        }
        return RecursionFib(n-1) + RecursionFib(n-2);
    }
    public static int LoopFib(int n){
        int firstTerm = 0; int secondTerm = 1; int nextTerm;
        if(n==1)
            return firstTerm;
        if(n==2)
            return secondTerm;
        for(int i = 2; i<n; i++){
            nextTerm = secondTerm;
            secondTerm+=firstTerm;
            firstTerm = nextTerm;
        }
        return secondTerm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The "+ n +"th term of fibonacci series using recursion is : " + RecursionFib(n));
        System.out.println("The "+ n +"th term of fibonacci series using for loop is : " + LoopFib(n));
    }
}
