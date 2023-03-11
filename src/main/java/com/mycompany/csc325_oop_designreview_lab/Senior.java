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
public class Senior extends Student{
    protected int credit;
    // check if the senior meet the min credit 85
    public Senior(String name, short num, int credit){
            super(name, num);
            if(credit >= 85){
                this.credit = credit;
            }
            else{
                System.out.println("Doesn't meet the requirement");
            }
        
        
    }
    @Override
    public String toString() {
        String s = "Name: " + name +"\n Age: "+ age + "\n Credit: "+ credit;
        return s;        
    
    }

}
