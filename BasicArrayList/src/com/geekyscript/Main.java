package com.geekyscript;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ArrayList is a Dynamic array
        ArrayList<Integer> list = new ArrayList<>();//Created ArrayList
        System.out.println("Before insertion ->" +list + " " + list.size()); // .size() used to get the length of the array list
        list.add(10);// inserting elements into the list
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("After insertion ->"+list + " " + list.size());//print the whole list
        for(int val: list){
            System.out.println(val); // printing elements one by one
        }

        for(int i = 0; i <list.size(); i++){// method 2
            System.out.println(list.get(i));// cannot use square brackets
        }

        list.set(2, 300); //sets element at index 2 to 300
        list.add(2, 2000); //adds element at index 2 and hence increases size of arraylist
        System.out.println("After set and add ->"+list + " " + list.size());
    }
}
