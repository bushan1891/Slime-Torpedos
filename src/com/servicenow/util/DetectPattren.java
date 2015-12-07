package com.servicenow.util;

import java.util.Arrays;

import com.servicenow.model.BliffoscopeData;
import com.servicenow.model.RejectoSpaceships;
import com.servicenow.model.SlimeTorpido;

public class DetectPattren {

   public static int PatternCheck(int i,int j,char[][] pat,char[][] src){
	   int found=0;
	   int count=0;
	   int c =pat.length;
	   int r=pat[0].length;
	   boolean check=true;
	   
	   for(int x=0;x<pat.length-1;x++ ){
		   for(int y=0;y<pat[0].length-1;y++){
			   
			   if(pat[x][y]==src[i][j]&&check){
				   count++;
				   i++;
				   j++;
			   }
			   else{
				   check=false;
				   break;
			   }
		   }
		   if(check==false)
			   break;
	   }
	   
	   if(check){
		   found=1;
		   
		   return found;
	   }
		   
	   
	   
	return found;   
   }
	
	
	public  int ScanR(SlimeTorpido rejecto,
			BliffoscopeData bliffoscope) {
	//	boolean check1 = false ;
		char[][] pat=rejecto.shape;
		char[][] src=bliffoscope.shape;
		int lenSrc = src[0].length;
		int lenPat = pat[0].length;
		int count=0;
		int found=0;
		int rows = 0;
		int cols = 0;
		 boolean result ;

		 System.out.println("patlen"+lenPat + "srclen"+ lenSrc);
		 
		 for(int i=0;i<lenSrc-lenPat-1;i++){
			 for(int j=0;j<lenSrc-lenPat-1;j++){
				
			found = PatternCheck(i,j,pat,src); 
			
			if(found==1){
				count++;
			}
			 }
		 }
			 
		 return count;
	} 
	
	
}
