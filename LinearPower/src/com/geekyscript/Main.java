package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and its power:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(x+" to the power "+n+" is: "+power(x, n));
    }

    public static int power(int x, int n){
        if (n==0) return 1;
        return x*power(x, n-1);

    }
}
