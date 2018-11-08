package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        Scanner scores= new Scanner (new File("scores.txt"));

        String lines[] = new String [100000];
        String names[] = new String[500];
        int satMath [] = new int [500];
        int satRead [] = new int [500];
        int satWrit [] = new int [500];


        int MaxIndx = -1;
        scores.nextLine();
        scores.useDelimiter("\\t");

        while(scores.hasNext())
        {
            MaxIndx++;
            lines[MaxIndx] = scores.next();
        }

        for(String a: lines)
        {
            System.out.println(a);
        }


    }
}
