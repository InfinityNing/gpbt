package com.company;
import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Sentence st;
        //StringBuffer sb=new StringBuffer();
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            st=new Sentence();
            System.out.println(st.making());
        }
    }
}
