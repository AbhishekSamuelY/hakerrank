   
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
