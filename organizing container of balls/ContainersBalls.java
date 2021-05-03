/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainersBalls {

	public static void main(String[] args) {

		int[][] container = new int[2][2];
		container[0][0] = 0;
		container[0][1] = 2;
		container[1][0] = 1;
		container[1][1] = 1;

		int n = container.length;

		int rows[] = new int[n];
		int cols[] = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rows[j] += container[i][j];
				cols[i] += container[i][j];
			}
		}
		Arrays.sort(rows);
		Arrays.sort(cols);
		for (int i = 0; i < rows.length; i++) {
			if (rows[i] != cols[i])
				System.out.println("Impossible");
		}
		System.out.println("Possible");

	}
}
