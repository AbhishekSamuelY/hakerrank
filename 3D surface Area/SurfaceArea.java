/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SurfaceArea {

	public static void main(String[] args) {

		int H = 3;
		int W = 3;

		int[][] A = new int[H][W];
		A[0][0] = 1;
		A[0][1] = 3;
		A[0][2] = 4;
		A[1][0] = 2;
		A[1][1] = 2;
		A[1][2] = 3;
		A[2][0] = 1;
		A[2][1] = 2;
		A[2][2] = 4;
		
		int area = 0;

        for (int i = 0; i < A.length; i++) {
            int areaOfOneRow = A[i][0];
            for (int j = 0; j < A[i].length - 1; j++) {
                if (A[i][j + 1] > A[i][j]) {
                    areaOfOneRow += A[i][j + 1] - A[i][j];
                }
            }
            area += areaOfOneRow * 2;
        }

        for (int i = 0; i < A[0].length; i++) {
            int areaOfOneColumn = A[0][i];
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j + 1][i] > A[j][i]) {
                    areaOfOneColumn += A[j + 1][i] - A[j][i];
                }
            }
            area += areaOfOneColumn * 2;
        }

        area += A.length * A[0].length * 2;

        System.out.println(area);
		
		
	}
}
