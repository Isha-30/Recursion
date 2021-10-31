package com.geekyscript;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(isPalindrome(str));
    }

    public static boolean isPalindrome(String st){
        int len = st.length();
        for(int i=0; i<len/2; i++){
            if(st.charAt(i) != st.charAt(len-i-1)) return false;
        }
        return true;
    }
}
