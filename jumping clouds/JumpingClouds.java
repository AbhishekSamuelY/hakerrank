/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingClouds {

	public static void main(String[] args) {

int[] c = new int[] { 1, 1, 1, 0, 1, 1, 0, 0, 0, 0 };
		int k = 3;
		int energy = 100;

		int size = c.length;
		for (int i = k; i <= c.length + k; i += k) {

			if (i >= c.length) {
				i -= c.length;
			}

			if (c[i] == 0) {
				energy -= 1;
			} else {
				energy -= 3;
			}

			if (i == 0 && energy < 100) {
				break;
			}

		}

		System.out.println(energy);
	}
}
