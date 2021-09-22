   
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
