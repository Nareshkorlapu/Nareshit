package com.Nit.Test_15_02_25_ConsonantOrVowel;

import java.util.Scanner;
public class ConsonantOrVowel
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the character:");
    char character=sc.next().charAt(0);
    int Unicode=character;
    if((character>='a' && character<='z') || (character>='A' && character<='Z')){
    switch(character)
    {
        case 'A','a','E','e','I','i','O','o','U','u':
        System.out.println(character+" is vowel");
        System.out.printf("Unicode value:%d",Unicode);
        break;
        default:
        System.out.println(character+" is consonant");
        System.out.printf("Unicode value:%d",Unicode);
        break;
    }
    }
    else
    {
    	System.out.println("Not a Character");
    }
    sc.close();
    }
}
