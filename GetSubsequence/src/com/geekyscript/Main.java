package com.geekyscript;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> result = getSub(str);
        System.out.print(result);
    }

    public static ArrayList<String> getSub(String st){
        if(st.length()==0){
            ArrayList<String> blank = new ArrayList<>();
            blank.add("");
            return blank;
        }
        // let the string be abc
        char first = st.charAt(0);//a
        String rest = st.substring(1);//creating a substring bc
        ArrayList<String> resultSS = getSub(rest);// call getSub for rest substring
        //resultSS = [__, _c, b_, bc]
        ArrayList<String> finalRes = new ArrayList<>();//creating arrayList for final result
        for(String rstr: resultSS){ //for rstr(element) in resultSS
            finalRes.add(""+rstr); //adding blank to resultSS
            //finalRes = [___, __c, _b_, _bc]
        }
        for(String rstr: resultSS){ //for rstr(element) in resultSS
            finalRes.add(first +rstr); //adding first i.e a to resultSS
            //finalRes = [___, __c, _b_, _bc, a__, a_c, ab_, abc]
        }
        return finalRes;


    }
}
