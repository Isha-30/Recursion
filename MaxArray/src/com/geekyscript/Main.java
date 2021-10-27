package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxArray(arr, 0));
    }

    public static int maxArray(int[] arr, int idx){
        if(idx==arr.length)return 0;
        int Max = maxArray(arr, idx+1);
        if(arr[idx]>Max){
            Max = arr[idx];
        }
        return Max;

    }
}
