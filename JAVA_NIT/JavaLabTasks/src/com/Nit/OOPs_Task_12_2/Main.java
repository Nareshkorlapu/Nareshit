package com.Nit.OOPs_Task_12_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Employee " + i + ":");
            

            Employee ei = Employee.getEmployeeObject(); 


            System.out.println(ei.toString());
            System.out.println("------------------------------------------------------------");
        }

        sc.close();
    }
}
