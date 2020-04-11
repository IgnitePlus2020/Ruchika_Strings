package com.tgt.igniteplus;

/**
 * Created by user on 4/10/2020.
 */
/* Here is a program to demonstrate the immutability of strings*/
public class Immutability {
    public static void main(String args[]){
        String initialString = "Hello";
        initialString.concat(" Target!"); //Hello Target is created in heap but there is no ref to it
        System.out.println("The initial string (Hello) after calling concat with (Target) on it is:" +initialString);
        initialString = initialString.concat(" Target!");
        System.out.println("Storing the reference of concat of initial string (Hello) with (Target) in initial string:" +initialString);
        String newString = initialString;
        System.out.println("The new string initialised with initialString (Hello) is:" +newString);
        newString = initialString.concat(" Target!");
        System.out.println("Explicit reference variables of string objects are required to see the concat result");
        String hi = "Hi";
        String city = "Bangalore";
        System.out.println("The string hi is:" + hi);
        System.out.println("The string city is:" + city);
        hi+=city;
        System.out.println("Calling + operator on hi and city and storing ref in hi, the variable hi is:" +hi);
        StringBuffer sbf = new StringBuffer("Hello");
        /*sbf.concat(" StringBuffer"); need to use append*/
        sbf.append(" StringBuffer");
        StringBuilder sbd = new StringBuilder("Hi");
        sbd.append(" StringBuilder");
        System.out.println("StringBuffer concatenation:" + sbf);
        System.out.println("StringBuilder concatenation:" + sbd);
    }
}

/* Output:
The initial string (Hello) after calling concat with (Target) on it is:Hello
Storing the reference of concat of initial string (Hello) with (Target) in initial string:Hello Target!
The new string initialised with initialString (Hello) is:Hello Target!
Explicit reference variables of string objects are required to see the concat result
The string hi is:Hi
The string city is:Bangalore
Calling + operator on hi and city and storing ref in hi, the variable hi is:HiBangalore
StringBuffer concatenation:Hello StringBuffer
StringBuilder concatenation:Hi StringBuilder
 */