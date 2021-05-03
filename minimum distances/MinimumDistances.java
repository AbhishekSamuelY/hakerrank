/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances {

	public static void main(String[] args) {

int[] a = new int[] { 7, 1, 3, 4, 1, 7 };
		 List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < a.length;i++)
        {
            if(i+1 <= a.length)
            {
            for(int j = i+1; j < a.length;j++)
            {
                if(a[i] == a[j])
                {
                    list.add(j-i);
                }
            }
            }
        }
        
        int smallest = -1;
        if(list.size() != 0)
        {
        smallest = list.get(0);
        for(int n : list)
        {
            if(n < smallest)
                smallest = n;
        }
        }

		System.out.println(smallest);
	}
}
