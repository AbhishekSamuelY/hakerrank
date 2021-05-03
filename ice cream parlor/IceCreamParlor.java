/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IceCreamParlor {

	public static void main(String[] args) {

	int result[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int y = m - x;
            Integer j = map.get(y);
            if (j != null) {
                result[0] = j + 1;
                result[1] = i + 1;
                break;
            }
            map.put(x, i);

        }
        
        for (int i : result) {
		System.out.println(i);
	}
		
		
	}
}
