/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cavity {

	public static void main(String[] args) {

		String[] grid = new String[4];
		grid[0] = "1112";
		grid[1] = "1912";
		grid[2] = "1892";
		grid[3] = "1234";

		int n = grid.length;
		int[][] matrix = new int[n][n];
		String[][] result = new String[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				String str = grid[i];
				String[] row = str.split("");
				matrix[i][j] = Integer.parseInt(row[j]);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = String.valueOf(matrix[i][j]);
				if (i > 0 && i < n - 1 && j > 0 && j < n - 1) {
					if (matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i + 1][j]
							&& matrix[i][j] > matrix[i][j - 1] && matrix[i][j] > matrix[i][j + 1])
						result[i][j] = "X";
				}

			}
		}

		for (int i = 0; i < n; i++) {
			String str = "";
			for (int j = 0; j < n; j++) {
				str += result[i][j];
			}

			grid[i] = str;
		}

		for (String s : grid) {
			System.out.println(s);
		}

		
		
	}
}
