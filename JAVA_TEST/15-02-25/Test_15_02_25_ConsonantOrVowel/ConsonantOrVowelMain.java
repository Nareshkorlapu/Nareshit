package com.Nit.Test_15_02_25_ConsonantOrVowel;

import java.util.*;
public class ConsonantOrVowelMain{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        int uniCode=ch;
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
        switch(ch){
            case 'A':
                System.out.println(ch+" is a vowel.");
                break;
            case 'E':
                System.out.println(ch+" is a vowel.");
                break;
            case 'I':
                System.out.println(ch+" is a vowel.");
                break;
            case 'O':
                System.out.println(ch+" is a vowel.");
                break;
            case 'U':
                System.out.println(ch+" is a vowel.");
                break;
                case 'a':
                System.out.println(ch+" is a vowel.");
                break;
            case 'e':
                System.out.println(ch+" is a vowel.");
                break;
            case 'i':
                System.out.println(ch+" is a vowel.");
                break;
            case 'o':
                System.out.println(ch+" is a vowel.");
                break;
            case 'u':
                System.out.println(ch+" is a vowel.");
                break;
            default:
            System.out.println(ch+" is a consonant.");
        }
        System.out.println("Unicode value: "+uniCode);
    }
    else{
        System.out.println("Not a Character");
    }
    sc.close();
    }
}


