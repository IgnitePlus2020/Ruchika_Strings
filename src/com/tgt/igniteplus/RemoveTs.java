package com.tgt.igniteplus;

import java.util.Scanner;

/**
 * Created by user on 4/10/2020.
 */
/*
Takes a string as input and removes all the letter T (or t) from it and returns the resultant string
 */
public class RemoveTs {
    public static void main(String args[]) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the string to remove t's:");
        String input = in.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < input.length();i++){
            char ch = input.charAt(i);
            if( ch == 't' || ch == 'T')
                continue;
            res.append(ch);
        }
        System.out.println("The resultant string after removing t's is:" + res);
    }
}
/*
Enter the string to remove t's:
This is an eg string to test tees
The resultant string after removing t's is:his is an eg sring o es ees

 */