/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualizeArray {

	public static void main(String[] args) {

int[] arr = new int[] { 3, 3, 2, 1, 3 };
		int max = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : arr) {
			if (!map.containsKey(n)) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n) + 1);
				if (max < map.get(n))
					;
				max = map.get(n);
			}
		}

		System.out.println(arr.length - max);
	}
}
