package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        zigZag(n);
    }

    public static void zigZag(int n){
        if(n==0)return;
        System.out.print(n + " ");
        zigZag(n-1);
        System.out.print(n + " ");
        zigZag(n-1);
        System.out.print(n + " ");
    }
}
