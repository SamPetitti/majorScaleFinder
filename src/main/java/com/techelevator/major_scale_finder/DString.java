package com.techelevator.major_scale_finder;

public class DString extends GuitarString {
	
	public DString() {
		
	}
	
	public static String[] guitarFrets  = new String[] {"0:D ", 
														"1:D#/Eb ",
														"2:E ",
														"3:F",
														"4:F#/Gb ",
														"5:G ",
														"6:G#/Ab ",
														"7:A ",
														"8:A#/Bb ",
														"9:B ",
														"10:C ",
														"11:C#/Db ",
														"12:D ", 
														"13:D#/Eb ",
														"14:E ",
														"15:F ",
														"16:F#/Gb ",
														"17:G ",
														"18:G#/Ab ",
														"19:A "};
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
