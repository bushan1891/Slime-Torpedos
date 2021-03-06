package com.servicenow.app;

import java.io.*; 
import java.util.*; 

import com.servicenow.model.BliffoscopeData;
import com.servicenow.model.RejectoSpaceships;
import com.servicenow.model.SlimeTorpido;
import com.servicenow.util.*;   
import com.servicenow.util.DetectPattren;
public class WarController { 
    public static void main(String[]args) { 
        
    	// loading SlimeTorpido 
    	SlimeTorpido slime =new SlimeTorpido();
    	slime.setCharFormat("SlimeTorpedo.blf");
    	slime.display();
    	
    	// loading Rejecto-Spaceship 
    	RejectoSpaceships rejecto = new  RejectoSpaceships();
    	rejecto.setCharFormat("Starship.blf");
    	rejecto.display();
    	
    	// loading BliffoscopeData 
    	BliffoscopeData bliffoscope = new BliffoscopeData();
    	bliffoscope.setCharFormat("TestData.blf");
    	//bliffoscope.display();
    	
    	
    	// Detect Slime-Torpido 
    	DetectPattren d = new DetectPattren(); 
    	int i = d.ScanR(slime,bliffoscope);
    	
    	// Print out number of Pattren found 
        System.out.println(i);
    	
    	
    	 
    }

	
}
