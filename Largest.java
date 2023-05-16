package com.ashish;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();
        System.out.print("Enter Third Number: ");
        int c = in.nextInt();
        System.out.print("Enter Fourth Number: ");
        int d = in.nextInt();
        System.out.print("Enter Fifth Number: ");
        int e = in.nextInt();


        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        if (d > max){
            max = d;
        }
        if (e > max){
            max = e;
        }
        System.out.println("The Maxium Number Is: " + max);
    }
}
