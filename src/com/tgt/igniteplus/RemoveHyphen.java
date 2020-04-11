package com.tgt.igniteplus;

import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * Created by user on 4/12/2020.
 */
// This prog removes hyphen if it is between digit on both its left and right
public class RemoveHyphen {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = in.nextLine();
        int len = input.length();
        StringBuilder res = new StringBuilder();
        if(len > 0)
            res.append(input.charAt(0));
        for(int i = 1; i < len - 1; i++){
            if(isDigit(input.charAt(i-1)) && isDigit(input.charAt(i+1)) && input.charAt(i) == '-')
                continue;
            res.append(input.charAt(i));
        }
        if(len > 1)
            res.append(input.charAt(len-1));
        System.out.println("The resultant string is:" + res);
    }
}
/*
Enter the string:
abc1-2 3-4-ab6-
The resultant string is:abc12 34-ab6-

 */