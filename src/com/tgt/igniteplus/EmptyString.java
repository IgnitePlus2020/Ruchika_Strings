package com.tgt.igniteplus;

import java.util.Scanner;

/**
 * Created by user on 4/12/2020.
 */
/*
Checks if the given string is empty or not
 */
public class EmptyString {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string to check:");
        String input = in.nextLine();
        if(input.isEmpty())
            System.out.println("The string is empty");
        else
            System.out.println("The string is not empty");
    }
}
/*
1. Enter the string to check:

The string is empty

2. Enter the string to check:
Java
The string is not empty
 */