package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to check occurrence: ");
        int ele = sc.nextInt();
        System.out.println("First occurrence of element: "+first(arr, 0, ele));
        System.out.println("Last occurrence of element: "+ last(arr, n, ele));
    }

    public static int first(int[] arr, int idx, int n){
        if(idx==arr.length)return -1;

        if(arr[idx]==n){
            return idx;
        }
        else{
            int ans = first(arr, idx+1, n);
            return ans;
        }
    }

    public static int last(int[] arr, int len, int n){
        if(len<0)return -1;
        if(arr[len-1]==n){
            return len-1;
        }
        else{
            int ans = last(arr, len-1, n);
            return ans;
        }
    }
}
