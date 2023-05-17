package com.Ashish;

import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
////        System.out.println(greet()); //you can also print directly
//    }
//
//    static String greet(){
//        String greeting = "How are you?";
//        return greeting;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalized = myGreet(naam);
        System.out.println(personalized);
    }

        static String myGreet(String name){
            String message = "Hello " + name;
            return message;
        }


}

