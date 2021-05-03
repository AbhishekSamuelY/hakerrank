/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PriyankaAndToys {

	public static void main(String[] args) {

		int[] w = new int[] { 12, 15, 7, 8, 19, 24 };
		
		Arrays.sort(w);
		
		int count = 1;
		int weight = w[0];

		for (int i = 0; i < w.length; i++) {
			if (w[i] < weight + 4) {
				count++;
				weight = w[i];
			}
		}

		System.out.println(count);
		
	}
}
