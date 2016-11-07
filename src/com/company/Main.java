package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {

        int n =in.nextInt();
        int [] a= new int[n];
        for (int i=0; i<n; i++){
            int f =in.nextInt();
            a[i]=f;
        }



        int t=0;
        int k=0;

        for (int i=0; i<n;i++){
            if(a[i]%2==1){
                t=t+a[i];
                k++;
            }
        }
        if(k==0){
            System.out.print("NO");
        }
        else
        {
            float m=(float)t;
            float s=(float)k;
            float x=t/k;
            System.out.printf("%.2f",x);
        }
    }
}