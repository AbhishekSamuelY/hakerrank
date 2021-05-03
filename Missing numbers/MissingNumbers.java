/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.*;

public class MissingNumbers {

	public static void main(String[] args) {

		int[] arr = new int[] { 11, 4, 11, 7, 13, 4, 12, 11, 10, 14 };
		int[] brr = new int[] { 11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12 };

		Map<Integer, Integer> org = new HashMap<Integer, Integer>();
		
		for(int n : brr)
		{
			if(org.containsKey(n))
			{
				org.put(n, org.get(n)+1);
			} else
			{
				org.put(n, 1);
			}
		}
		
		for(int n : arr)
		{
			if(org.containsKey(n))
			{
				if(org.get(n) == 1)
					org.remove(n);
				else
					org.put(n, org.get(n)-1);
			} else
			{
				org.put(n, 1);
			}
		}
		

		int[] result = new int[org.size()];
		int count = 0;
		
		for (int x : org.keySet()) {
			result[count] = x;
			count++;
			System.out.println(x);
		}

	}
}
