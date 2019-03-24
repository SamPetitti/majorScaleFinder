package com.techelevator.major_scale_finder;

public class AString extends GuitarString {
	public static String[] guitarFrets  = new String[] {"0:A ", 
														"1:A#/Bb ",
														"2:B ",
														"3:C ",
														"4:C#/Db ",
														"5:D ",
														"6:D#/Eb ",
														"7:E ",
														"8:F ",
														"9:F#/Gb ",
														"10:G ",
														"11:G#/Ab ",
														"12:A ", 
														"13:A#/Bb ",
														"14:B ",
														"15:C ",
														"16:C#/Db ",
														"17:D ",
														"18:D#/Eb ",
														"19:E"};
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
