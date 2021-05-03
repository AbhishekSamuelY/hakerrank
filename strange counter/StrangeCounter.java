/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {

		long t = 4;
		long rem = 3L;
		while (t > rem) {
			t = t - rem;
			rem *= 2;
		}
		System.out.println(rem - t + 1);
		
		
	}
}
