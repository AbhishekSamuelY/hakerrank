   
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
