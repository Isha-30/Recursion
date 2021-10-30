package com.geekyscript;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){

        if(sr==dr && sc==dc){
            ArrayList<String> blank = new ArrayList<>();
            blank.add("");
            return blank;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc<dc){
            hpaths = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr<dr){
            vpaths = getMazePaths(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String hpath: hpaths){
            paths.add("h" + hpath);
        }

        for(String vpath: vpaths){
            paths.add("v" + vpath);
        }

        return paths;
    }

    public static void printMazeWithJump(int sr, int sc, int dr, int dc, String psf){
        if(sr==dr && sc==dc){
            System.out.println((psf));
            return;
        }
        for(int ms = 1; ms<= dc-sc; ms++){
            printMazeWithJump(sr, sc+ms, dr, dc, psf + "h" + ms);
        }

        for(int ms = 1; ms<= dr-sr; ms++){
            printMazeWithJump(sr+ms, sc, dr, dc, psf + "v" + ms);
        }

        for(int ms = 1; ms<= dr-sr && ms<= dc-sc; ms++){
            printMazeWithJump(sr+ms, sc+ms, dr, dc, psf + "d" + ms);
        }
    }
}
