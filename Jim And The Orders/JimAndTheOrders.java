/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

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
