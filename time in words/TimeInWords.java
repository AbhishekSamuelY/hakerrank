/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

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
