package com.geekyscript;

import java.util.Stack;

public class Main {
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) {
	// write your code here
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Original Stack:");
        System.out.println(st);
        reverse();
        System.out.println("Reversed Stack:");
        System.out.println(st);
    }
    public static void insertAtBottom(int x){
        if(st.isEmpty()){
            st.push(x);
        }
        else{
            int a = st.peek();
            st.pop();
            insertAtBottom(x);
            st.push(a);
        }
    }
    public static void reverse(){
        if(st.size()>0){
            int x = st.peek();
            st.pop();
            reverse();
            insertAtBottom(x);
        }
    }
}
