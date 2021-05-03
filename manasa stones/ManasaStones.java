/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManasaStones {

	public static void main(String[] args) {

		//the output is not in ascending order
		
		int n = 3;
		int a = 2;
		int b = 3;
				
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; i < n; i++)
		{
			set.add((b*i)+(a*(n-i-1)));
		}

		for(int x : set)
		{
			System.out.println(x);
			set.toArray();
		}
		
		
	}
}
