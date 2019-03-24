package com.techelevator.major_scale_finder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class GuitarString {
	
	public static String[] guitarFrets  = new String[20];
	
	
	public void findMajorScale(int startingFret) {
		if(startingFret + 7 > 19) {
			System.out.println("Please enter a number less than 7");
		} else {
		System.out.println(guitarFrets[startingFret] + " " +  
						guitarFrets[startingFret + 2]  + " " +
						guitarFrets[startingFret + 4]  + " " +
						guitarFrets[startingFret + 5] + " " + 
						guitarFrets[startingFret + 7] + " " + 
						guitarFrets[startingFret + 9] +  " " + 
						guitarFrets[startingFret + 11] + " " +
						guitarFrets[startingFret + 12]); 	
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EString eString = new EString();
		Bstring bString = new Bstring();
		GString gString = new GString();
		DString dString = new DString();
		AString aString = new AString();
		boolean x = true;
		
		while(x) {
		System.out.println("Please enter the string you would like play your major scale on (E, A, D, G, B, E), or String Number (1-6) or X to exit");
		Scanner kb = new Scanner(System.in);
		String stringEntered = kb.nextLine().toLowerCase();
		if(stringEntered.equals("x")){
			x = false;
			break;
		} 
		
		int fret = 0;
		System.out.println("Please enter the fret you would like to start from"); 
		try{String fretEntered = kb.nextLine().toLowerCase();
		fret = Integer.parseInt(fretEntered);
		} catch (Exception e) {
			System.out.println("please enter a number 0 through 7");
			kb.close();
			stringEntered = "y";
		}
		
		switch(stringEntered) {
		  case "e" :
		        eString.findMajorScale(fret);
		  break;
		  case "b" :
		       bString.findMajorScale(fret);
		  break;
		  case "g" :
			  gString.findMajorScale(fret);
			  break;
		  case "d" :
			  dString.findMajorScale(fret);
			  break;
		  case "a" :
			  aString.findMajorScale(fret);
			  break;
		  case "1" :
		        eString.findMajorScale(fret);
		  break;
		  case "2" :
		       bString.findMajorScale(fret);
		  break;
		  case "3" :
			  gString.findMajorScale(fret);
			  break;
		  case "4" :
			  dString.findMajorScale(fret);
			  break;
		  case "5" :
			  aString.findMajorScale(fret);
			  break;	  
		  case "6" :
		        eString.findMajorScale(fret);
		        break;
		  case "y" :
			  break;
			  
		}
	  }
    }
}
