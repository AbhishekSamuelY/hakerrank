   
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

public class JimAndTheOrders {

	public static void main(String[] args) {

		int[][] orders = new int[5][2];
		orders[0][0] = 8;
		orders[0][1] = 1;
		orders[1][0] = 4;
		orders[1][1] = 2;
		orders[2][0] = 5;
		orders[2][1] = 6;
		orders[3][0] = 3;
		orders[3][1] = 1;
		orders[4][0] = 4;
		orders[4][1] = 3;
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
		Set<Integer> keys = new HashSet<Integer>();
		
		int[] output = new int[orders.length];
		
		for(int i = 0; i < orders.length;i++)
		{
			map.put(i+1,orders[i][0]+orders[i][1]);
		}
		

		Map<Integer,Integer> sortedMap = MapSort.sortByValues(map);
		
		output = sortedMap.keySet().stream().mapToInt(java.lang.Integer::intValue).toArray();
		
		for(int n : output)
		{
			System.out.println(n);
		}
	}
	
	static class MapSort {
		public static <K,V extends Comparable<V>> Map<K,V> sortByValues(final Map<K,V> map){
		
			Comparator<K> valueComparator = new Comparator<K>() {
				public int compare(K K1, K K2) {
					int compare = map.get(K1).compareTo(map.get(K2));
					return (compare == 0) ? 1: compare;
				}
			};
		
			Map<K,V> sortByValues = new TreeMap<K, V>(valueComparator);
			sortByValues.putAll(map);
			return sortByValues;
		}
	}
	
}
