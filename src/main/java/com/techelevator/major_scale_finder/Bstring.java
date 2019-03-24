package com.techelevator.major_scale_finder;

public class Bstring extends GuitarString {
	
	public Bstring() {
	}
	
	
	public static String[] guitarFrets  = new String[] {"0:B ", 
														"1:C ",
														"2:C#/Db ",
														"3:D ",
														"4:D#/Eb ",
														"5:E ",
														"6:F ",
														"7:F#/Gb ",
														"8:G ",
														"9:G#/Ab ",
														"10:A ",
														"11:A#/Bb ",
														"12:B ", 
														"13:C ",
														"14:C#/Db ",
														"15:D ",
														"16:D#/Eb ",
														"17:E ",
														"18:F ",
														"19:F#/Gb "};
	
	@Override
	public void findMajorScale(int startingFret) {
		if(startingFret + 12 > 19) {
			System.out.println("Please enter a number less than 7");
			return;
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

}
