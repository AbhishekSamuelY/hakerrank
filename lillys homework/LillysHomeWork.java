   
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

public class LillysHomeWork {

	public static void main(String[] args) {

		int[] arr = new int[] {3, 4, 2, 5, 1};
        
		TreeMap<Integer, Integer> forwardMap = new TreeMap<Integer, Integer>();
		TreeMap<Integer, Integer> backwardMap = new TreeMap<Integer, Integer>();
		int[] backwardArr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			forwardMap.put(arr[i], i);
			backwardMap.put(arr[i], i);
			backwardArr[i] = arr[i];
		}
		
		//forward search
		int index = 0;
		int numOfSwapsForward = 0;
		while(index < arr.length)
		{
			int smallest = forwardMap.firstKey();
			if(arr[index] != smallest)
			{
				int targetIndex = forwardMap.get(smallest);
				int temp = arr[index];
				arr[index] = smallest;
				arr[targetIndex] = temp;
				
				forwardMap.put(arr[targetIndex], targetIndex);
				numOfSwapsForward++;
			}
			
			index++;
			forwardMap.remove(smallest);
		}

		//forward search
		index = backwardArr.length-1;
		int numOfSwapsBackward = 0;
		while(index >= 0)
		{
			int smallest = backwardMap.firstKey();
			if(backwardArr[index] != smallest)
			{
				int targetIndex = backwardMap.get(smallest);
				int temp = backwardArr[index];
				backwardArr[index] = smallest;
				backwardArr[targetIndex] = temp;
				
				backwardMap.put(backwardArr[targetIndex], targetIndex);
				numOfSwapsBackward++;
			}
			
			index--;
			backwardMap.remove(smallest);
		}
		
		System.out.println(Math.min(numOfSwapsForward, numOfSwapsBackward));
		
	}
}
