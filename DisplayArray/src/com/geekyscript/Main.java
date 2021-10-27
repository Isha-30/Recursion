package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        display1(arr, 0);
        System.out.print("\n");
        display2(arr, 2); //idx can be taken as per choice, here it is 2 just to check where it stops
        System.out.print("\n");
        displayReverse(arr, 3);
    }

    public static void display1(int[] arr, int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        display1(arr, idx+1);
    }

    public static void display2(int[] arr, int idx){
        if(idx<0)return;
        display2(arr, idx-1);
        System.out.print(arr[idx]+" ");
    }

    public static void displayReverse(int[] arr, int idx){
        if(idx<0)return;
        System.out.print(arr[idx] + " ");
        displayReverse(arr, idx-1);
    }
}
