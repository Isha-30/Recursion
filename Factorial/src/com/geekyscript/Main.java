package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        System.out.println("Factorial of "+a+"is "+fact(a));
    }
    public static int fact(int n){
        if(n==0)return 1;
        return n*fact(n-1);
    }
}
