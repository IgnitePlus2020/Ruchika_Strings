package com.tgt.igniteplus;

import java.util.Scanner;

/**
 * Created by user on 4/12/2020.
 */
/*
Takes a string as input and checks if it contains only numbers
 */
public class ContainsOnlyDigits {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string to check:");
        String input = in.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < input.length();i++){
            char ch = input.charAt(i);
            if(ch >= '0' && ch <= '9')
                continue;
            else{
                System.out.println("The string does not have only numbers");
                System.exit(0);
            }
        }
        System.out.println("The string has only numbers");
    }
}
/*
1. Enter the string to check:
12686
The string has only numbers

2. Enter the string to check:
1268ab6
The string does not have only numbers
 */