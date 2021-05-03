/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

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
