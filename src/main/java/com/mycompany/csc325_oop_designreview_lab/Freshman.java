package com.mycompany.csc325_oop_designreview_lab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juilliardwu
 */
public class Freshman extends Student{
    protected int credit;
    //freshment constructor
    public Freshman(String name, short num, int credit){
        super(name, num);
        this.credit = credit;
    }
    //freshment toString method
    @Override
    public String toString() {
        String s = "Name: " + name +"\n Age: "+ age + "\n Credit: "+ credit;
        return s;        
    
    }
    
}
