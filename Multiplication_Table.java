package com.Ashish3;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();

        for (int i = 0; i<= 10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
