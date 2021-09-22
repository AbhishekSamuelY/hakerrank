   
/*
 
       d8888 888888b.   888    888 8888888 .d8888b.  888    888 8888888888 888    d8P   .d8888b.        d8888 888b     d888 888     888 8888888888 888    Y88b   d88P 
      d88888 888  "88b  888    888   888  d88P  Y88b 888    888 888        888   d8P   d88P  Y88b      d88888 8888b   d8888 888     888 888        888     Y88b d88P  
     d88P888 888  .88P  888    888   888  Y88b.      888    888 888        888  d8P    Y88b.          d88P888 88888b.d88888 888     888 888        888      Y88o88P   
    d88P 888 8888888K.  8888888888   888   "Y888b.   8888888888 8888888    888d88K      "Y888b.      d88P 888 888Y88888P888 888     888 8888888    888       Y888P    
   d88P  888 888  "Y88b 888    888   888      "Y88b. 888    888 888        8888888b        "Y88b.   d88P  888 888 Y888P 888 888     888 888        888        888     
  d88P   888 888    888 888    888   888        "888 888    888 888        888  Y88b         "888  d88P   888 888  Y8P  888 888     888 888        888        888     
 d8888888888 888   d88P 888    888   888  Y88b  d88P 888    888 888        888   Y88b  Y88b  d88P d8888888888 888   "   888 Y88b. .d88P 888        888        888     
d88P     888 8888888P"  888    888 8888888 "Y8888P"  888    888 8888888888 888    Y88b  "Y8888P" d88P     888 888       888  "Y88888P"  8888888888 88888888   888     
======================================================================================================================================================================
email: abhisheksamuel.y@gmail.com
github: abhisheksamuely@github
                                                                                                                                                                                                                                                                              
*/
package com.abhisheksamuely.hakerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeInWords {

	public static void main(String[] args) {

		int h = 12;
		int m = 01;

		String str = "";

		String[] numbers = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen",
				"eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
				"twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half" };

		System.out.println(numbers.length);


		if (m == 0) {
			str += numbers[h] + " o' clock";
		}else if (m == 1) {
			str += numbers[m] + " minute past " + numbers[h];
		} else if (m == 30) {
			str += numbers[m] + " past " + numbers[h];
		} else if (m < 30 && m == 15) {
			str += numbers[m] + " past " + numbers[h];
		} else if (m < 30) {
			str += numbers[m] + " minutes past " + numbers[h];
		} else if (m > 30 && m == 45) {
			str += numbers[60 - m] + " to " + numbers[h + 1];
		} else if (m > 30) {
			str += numbers[60 - m] + " minutes to " + numbers[h + 1];
		}

		System.out.println(str);
				
	}
}
