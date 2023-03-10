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
    private double GPA;
    private int credit;
    // Overloading constructor for the Human class
    public Student(String name, short num){
        super(name, num);
    }
    public Student(String name, short num , int credit){
        super(name, num);
        this.credit = credit;
    }
    //Setter for address
    public void setAddress(String address){
        this.address = address;
    }
    //Getter for address
    public String getAddress(){
        return address;
    }

    // Setter for GPA
     public double getGPA() {
        return GPA;
    }
    // Getter for GPA
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
	
}
