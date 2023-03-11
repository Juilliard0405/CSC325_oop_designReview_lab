/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
                // create different object for each claass
		Student std1= new Student("James", (short)20);

		Student std2= new Freshman("James",(short) 20, 12); // name, age, credits

                Student std3 = new Senior("John",(short) 30, 90);
                
                // Scaner scan GPA
                Scanner sc = new Scanner(System.in);
                
                double GPA = sc.nextDouble();
                std1.setGPA(GPA);
                System.out.println(std1.getGPA());

		System.out.println(std1);
                System.out.println(std2);
                System.out.println(std3);

	}

}

