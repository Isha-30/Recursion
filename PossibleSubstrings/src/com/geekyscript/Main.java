package com.geekyscript;

import java.util.Scanner;

//Print all possible strings of length k that can be formed from a set of n characters
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of char array: ");
        int n = sc.nextInt();
        char set[]  = new char[n];
        System.out.print("Enter the elements as string: ");
        String s = sc.next();
        for(int i = 0; i<n; i++){
            set[i] = s.charAt(i);
        }
        System.out.print("Enter the length of String: ");
        int k = sc.nextInt();
        printKLengthString(set, "", n, k);
    }
    public static void printKLengthString(char set[], String sequence, int n, int k) {
        if (k == 0) {
            System.out.println(sequence + "\t");
            return;
        }
        for (int i = 0; i < n; i++) {
            String newSequence;
            newSequence = sequence + set[i];
            printKLengthString(set, newSequence, n, k - 1);
        }
    }
}
