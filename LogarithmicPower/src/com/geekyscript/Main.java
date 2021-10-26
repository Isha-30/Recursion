package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and its power:");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Answer: "+logPow(x, n));

    }


    public static int logPow(int x, int n){
        if(n==0)return 1;
        else if(n%2 == 0){
            return logPow(x, n/2)*logPow(x, n/2);
        }
        else{
            return x*logPow(x, n/2)*logPow(x, n/2);
        }
    }
}
