package com.techelevator.major_scale_finder;



public class EString extends GuitarString {
	
	public EString() {
	}
	
	public static String[] guitarFrets  = new String[] {"0:E ", 
														"1:F ",
														"2:F#/Gb ",
														"3:G ",
														"4:G#/Ab ",
														"5:A ",
														"6:A#/Bb ",
														"7:B ",
														"8:C ",
														"9:C#/Db ",
														"10:D ",
														"11:D#/Eb ",
														"12:E ", 
														"13:F ",
														"14:F#/Gb ",
														"15:G ",
														"16:G#/Ab ",
														"17:A ",
														"18:A#/Bb",
														"19:B "};
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
