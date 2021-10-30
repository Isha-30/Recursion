package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        printPermutations(str, "");

    }
    public static void printPermutations(String ques, String asf){
        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i = 0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String left = ques.substring(0,i);
            String right = ques.substring(i+1);
            String rest = left+right;
            printPermutations(rest, asf + ch);
        }
    }
}
