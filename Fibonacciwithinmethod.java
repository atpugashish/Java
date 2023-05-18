package com.Ashish3;

import java.util.Scanner;

public class Fibonacciwithinmethod {
    public static void main(String[] args) {
        fibonacci();
        fibonacci();
        fibonacci();

    }

    static void fibonacci() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Nth number : ");
        int num = in.nextInt();

        int num1 = 0;
        int num2 = 1;
        int nextnum = 0;
        while (nextnum < num) {
            System.out.println(num1 + "   ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            nextnum = nextnum + 1;

        }
    }
}
