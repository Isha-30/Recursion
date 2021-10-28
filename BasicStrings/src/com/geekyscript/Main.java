package com.geekyscript;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Hello";//Define string
        for(int i = 0; i<str.length(); i++){//traversing string
            char ch = str.charAt(i);//Just like arrays, but here we use charAt()
            System.out.println(ch);
        }
        String ss = str.substring(1, 4);//returns substring of index 1,2,3(not4)
        String ss2 = str.substring(2);//returns substring from index 2 to end of string
        System.out.println(ss);
        System.out.println(ss2);
    }
}
