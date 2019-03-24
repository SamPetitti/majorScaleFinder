package com.techelevator.major_scale_finder;

public class GString extends GuitarString {
	
	public GString() {
	}
	
	public static String[] guitarFrets  = new String[] {"0:G ", 
														"1:G#/Ab ",
														"2:A ",
														"3:A#/Bb ",
														"4:B ",
														"5:C ",
														"6:C#/Db ",
														"7:D ",
														"8:D#/Eb ",
														"9:E ",
														"10:F ",
														"11:F#/Gb ",
														"12:G ", 
														"13:G#/Ab ",
														"14:A ",
														"15:A#/Bb ",
														"16:B ",
														"17:C ",
														"18:C#/Db ",
														"19:D "};
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
