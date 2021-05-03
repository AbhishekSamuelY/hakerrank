/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String[] args) {

		/*
		 * y = current element
		 * x = sum of elements on either sides from the current element
		 * 
		 * x + y + x == sum
		 * 2x = sum - y
		 * */

		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(7);
		arr.add(5);
		arr.add(10);
		arr.add(2);
		arr.add(7);
		arr.add(4);
		arr.add(2);
		
		int sum = 0;
		int x = 0;
		boolean found = false;
		
		for(int n : arr)
		{
			sum += n;
		}
		
		for(int y : arr)
		{
			if(2*x == sum - y)
			{
				found = true;
			}
			x += y;
		}
		
		if(found)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}
