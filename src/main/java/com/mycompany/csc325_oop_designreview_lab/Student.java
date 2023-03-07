/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
	// ToDo 1: Make this class a child of Person
	// ToDo 1: Make this class a child of Human
    private String address;
    public Student(String name, short num){
        super(name,num);
    }
	// ToDo 2: Fix the resulting errors
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

	// ToDo 3: Add a field for GPA and create setter and getter
	
	// ToDo 4: Add comments to your code
}
