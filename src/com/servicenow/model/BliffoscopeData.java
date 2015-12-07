package com.servicenow.model;

import com.servicenow.util.ReadFile;

public class BliffoscopeData {

 public   char[][] shape ; 
   public static int len;
    
	public char[][] getCharFormat() {
		return shape;
	}

	public void setCharFormat(String fileName) {
		
		ReadFile read = new ReadFile();
		shape = read.Read(fileName);
		len=read.len;	
	}
	
	
	public void display(){
		System.out.println("I AM BLIFFOSCOPE");
		 //for testing purposes, prints the 2d charFormat array 
        for (int i = 0; i < len; i++) { 
            for (int j = 0; j < shape[i].length; j++) { 
                System.out.print(shape[i][j]); 
            } 
            System.out.println(""); 
        }
	}
	
	
	
}
