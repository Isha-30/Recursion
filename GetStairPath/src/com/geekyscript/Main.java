package com.geekyscript;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial stair number: ");
        int n = sc.nextInt();
        ArrayList<String> paths = getSPath(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getSPath(int n){
        if(n==0){
            ArrayList<String> blank = new ArrayList<>();
            blank.add("");
            return blank;
        }
        else if(n<0){
            ArrayList<String> neg = new ArrayList<>();
            return neg;
        }

        ArrayList<String> paths1 = getSPath(n-1);
        ArrayList<String> paths2 = getSPath(n-2);
        ArrayList<String> paths3 = getSPath(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for(String path: paths1){
            paths.add(1+path);
        }

        for(String path: paths2){
            paths.add(2+path);
        }

        for(String path: paths3){
            paths.add(3+path);
        }
        return paths;
    }
}
