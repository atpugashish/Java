package com.Ashish;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
        int ans = sum2();
        System.out.println(ans);
    }

//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number 1 : ");
//        int num1 = in.nextInt();
//        System.out.print("Enter number 2 : ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum = " + sum);
//    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
//        System.out.println(sum);
        return sum;
//        System.out.println("Sum = " + sum); //this will give error because of return.
    }
}
