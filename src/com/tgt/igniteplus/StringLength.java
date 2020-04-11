package com.tgt.igniteplus;

import java.util.Scanner;

/**
 * Created by user on 4/12/2020.
 */
/*
This program returns the length of the string given as input
 */
public class StringLength {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string to find its length:");
        String input = in.nextLine();
        int len = input.length();
        System.out.println("The length of the string is:" + len);

    }
}
/*
Enter the string to find its length:
This is cool!
The length of the string is:13

 */