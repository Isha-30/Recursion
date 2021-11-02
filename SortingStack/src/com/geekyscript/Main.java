package com.geekyscript;

import java.util.Stack;

public class Main {
    static Stack<Integer> st = new Stack<>();
    public static void main(String[] args) {
	// write your code here
        st.push(1);
        st.push(-1);
        st.push(2);
        st.push(-2);
        System.out.println("Original Stack:");
        System.out.println(st);
        sortStack(st);
        System.out.println("Sorted Stack:");
        System.out.println(st);
    }
    public static void sortMerge(Stack<Integer> s, int x){
        if(s.isEmpty() || x>s.peek()){
            s.push(x);
            return;
        }
        int a = s.peek();
        s.pop();
        sortMerge(s, x);
        s.push(a);
    }
    public static void sortStack(Stack<Integer> s){
        if(!s.isEmpty()){
            int a = s.pop();
            sortStack(s);
            sortMerge(s, a);
        }
    }
}
