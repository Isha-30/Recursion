package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 5;
        System.out.println("Decreasing sequence:");
        dec(n);

        System.out.println("Increasing sequence:");
        inc(n);
    }

    public static void dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        dec(n-1);
    }

    public static void inc(int n){
        if(n==0){
            return;
        }
        inc(n-1);
        System.out.println(n);

    }
}
