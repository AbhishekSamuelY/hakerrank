/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args) {

	int[] arr = new int[]{-5, 15, 25, 71, 63};
	Arrays.sort(arr);
        
        int min = arr[arr.length-1];
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i < arr.length-1;i++)
        {
            int diff = Math.abs(arr[i] - arr[i-1]);
            if(diff < min)
            {
                min = diff;
                list = new ArrayList<Integer>();
                list.add(arr[i-1]);   
                list.add(arr[i]);   
            } else if(diff == min)
            {
                list.add(arr[i-1]);   
                list.add(arr[i]); 
            }
        }
        
        int[] newArr = new int[list.size()];
        for(int i = 0; i < list.size();i++)
        {
           newArr[i] = list.get(i); 
        }

	for(int x : newArr)
	{
		System.out.println(x);
	}
		
		
	}
}
