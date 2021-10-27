package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        char t1 = 'A', t2 = 'B', t3 = 'C';
        toh(n, t1, t2, t3);
    }

    public static void toh(int n, char t1, char t2, char t3){
        if (n==0)return;
        toh(n-1, t1, t3, t2);
        System.out.println(n+" from "+t1+" to "+t2);
        toh(n-1, t3, t2, t1);
    }
}
