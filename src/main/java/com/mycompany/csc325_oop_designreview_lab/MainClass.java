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
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 7: Add a toString method for Student class
		// ToDo 9: Add a toString method for Freshman class

		Student std1= new Student("James", (short)20);
                // ToDo 10: Add a toString method for Senior class

		Student std2= new Freshman("James",(short) 20, 12); // name, age, credits

                Student std3 = new Senior("John",(short) 30, 90);
                
                Scanner scan = new Scanner("Student gpa: ");
                

		// ToDo 8: Set the gpa of the student using the scanner and user
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		System.out.println(std1);

                System.out.println(std2);

		// ToDo 9: add comments and explain your code
		// ToDo 12: add comments and explain your code

		// ToDo 10: submit using a pull request.
		// ToDo 13: submit using a pull request.
	}

}

