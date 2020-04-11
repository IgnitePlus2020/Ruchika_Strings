package com.tgt.igniteplus;

import java.util.Scanner;

/**
 * Created by user on 4/12/2020.
 */
// This prog demonstrates the different ways to compare two strings
public class CompareStrings {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the first string:");
        String input1 = in.nextLine();
        System.out.println("Enter the second string:");
        String input2 = in.nextLine();
        //Way 1
        System.out.println("Using ==");
        System.out.println("The two strings are equal:" + (input1 == input2));
        String temp = input2;
        System.out.println("The equality of input2 assigned to temp using ==:" + (temp == input2));
        //way 2
        System.out.println("Using equals method");
        System.out.println("The two strings are equal:" + input1.equals(input2));
        //way 3
        //returns 0 if they are equal
        System.out.println("Using compareTo method");
        System.out.println("The two strings are equal:" + (input1.compareTo(input2) == 0));
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(" == provides compare by ref");
        System.out.println(s1 == s2);
        System.out.println(" equals method provides compare by data");
        System.out.println(s1.equals(s2));
        String a = "a", b = "b";
        System.out.println("a and b compare returns:" + a.compareTo(b));

    }
}
/*
Enter the first string:
hi
Enter the second string:
hi
Using ==
The two strings are equal:false
The equality of input2 assigned to temp using ==:true
Using equals method
The two strings are equal:true
Using compareTo method
The two strings are equal:true
 == provides compare by ref
false
 equals method provides compare by data
true
a and b compare returns:-1
 */
