   
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

public class ServiceLane {

	public static void main(String[] args) {

		int n = 8;
		int t = 5;
		int[] widths = new int[] {2, 3, 1, 2, 3, 2, 3, 3};
		int[][] cases = new int[t][2];
		cases[0][0] = 0;
		cases[0][1] = 3;
		cases[1][0] = 4;
		cases[1][1] = 6;
		cases[2][0] = 6;
		cases[2][1] = 7;
		cases[3][0] = 3;
		cases[3][1] = 5;
		cases[4][0] = 0;
		cases[4][1] = 7;
		
		int[] output = new int[cases.length];

        for(int i = 0; i < t; i++)
        {
            int min = cases[i][0];
            int max = cases[i][1];
            
            int smallest = widths[min];
            
            for(int j = min ; j <= max;j++)
            {
                
                if(widths[j] < smallest)
                    smallest = widths[j];
            }
            
            output[i] = smallest;
        }
          
        for(int x : output)
        {
        	System.out.println(x);
        }
        
	}
}
