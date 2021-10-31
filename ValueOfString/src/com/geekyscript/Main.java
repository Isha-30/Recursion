package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(valueOfString(str, n));
    }
    public static int valueOfString(String str, int s){
        if(s==1){
            return(str.charAt(0) - '0');
        }
        return (10*valueOfString(str, s-1) + str.charAt(s-1) - '0');
    }
}
