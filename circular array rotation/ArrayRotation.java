/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		nt[] a = new int[] { 3, 4, 5 };
		int[] b = new int[] { 1, 2 };
		int[] c = new int[b.length];
		int n = 2;

		while (n != 0) {
			int temp = a[a.length - 1];
			for (int i = a.length - 1 - 1; i >= 0; i--) {
				a[i + 1] = a[i];
			}
			a[0] = temp;
			n--;
		}
		int counter = 0;
		for (int x : b) {
			c[counter] = a[x];
			counter++;
		}

		for (int y : c) {
			System.out.println(y);
		}
	}
}
