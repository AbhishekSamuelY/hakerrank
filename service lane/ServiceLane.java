/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


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
