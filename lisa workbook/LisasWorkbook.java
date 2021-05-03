/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LisasWorkbook {

	public static void main(String[] args) {

		int n = 5;
		int[] arr = new int[] {4, 2, 6, 1, 10};
		int k = 3;
		
        int specialProblems = 0;
        int pageNumber = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=arr[i];j++)
            { 
                if(k==1 || j%k==1)
                pageNumber++;
                if(j==pageNumber)
                specialProblems++;
            }
        }
		
		System.out.println(specialProblems);
		
		
	}
}
