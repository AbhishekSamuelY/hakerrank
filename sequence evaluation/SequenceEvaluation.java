/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceEvaluation {

	public static void main(String[] args) {

				int[] p = new int[] {4, 3, 5, 1, 2 };
		int[] b = new int[p.length];
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < p.length;i++)
		{
			list.add(p[i]);
		}
		
		int counter = 0;
		
		for(int i = 0; i < p.length;i++)
		{
			int x = p[i];
			int loc1 = list.indexOf(x);
			loc1++;
			int loc2 = list.indexOf(loc1);
			loc2++;
			int loc = list.indexOf(loc2);
			loc++;
			b[counter] = loc;
			counter++;
		}
		
		for(int n : b)
		{
			System.out.println(n);
		}
	}
}
