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
    protected double GPA;
    protected int credit;
    // Overloading constructor for the Human class

    public Student(String name, short age, double GPA) {
        super(name, age);
        this.GPA = GPA;
    }
    public Student(String name, short num){
    super(name, num);
    }
    
    @Override
    public String toString() {
        String s = "Name: " + name +"\n Age: "+ age +"\n GPA: " + GPA;
        return s;        
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
