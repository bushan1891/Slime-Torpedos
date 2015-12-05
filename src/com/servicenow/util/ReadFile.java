package com.servicenow.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	
	  public int len;

	public   char[][] Read(String fileName){
		
		
		File file = new File(fileName); 
		ArrayList<String> arrayList = new ArrayList<String>();
       try { 
            
               //reads each line from the text file and places it into a string array 
               BufferedReader br = new BufferedReader(new FileReader(file)); 
               String str; 
               while ((str = br.readLine()) != null) { 
                   arrayList.add(str); 
               } 
                  
               //creates a stringFormat array and places the strings in the array list onto the stringFormat array 
               String stringFormat[] = new String[arrayList.size()]; 
               arrayList.toArray(stringFormat); 
                  
               //creates 2d char array and writes the characters from the stringFormat array onto the 2d char array 
              char charFormat[][] = new char[stringFormat.length][]; 
               for (int i = 0; i < stringFormat.length; i++) { 
                   charFormat[i] = stringFormat[i].toCharArray(); 
               } 
                 len=stringFormat.length;
               return charFormat;
           }  
       catch (FileNotFoundException ex) { 
           ex.printStackTrace(); 
       }  
       catch (IOException ex) { 
           ex.printStackTrace(); 
       }
       return null; 
				
	}
	
	
}
