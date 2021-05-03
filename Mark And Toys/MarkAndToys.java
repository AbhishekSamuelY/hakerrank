/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarkAndToys {

	public static void main(String[] args) {

	Arrays.sort(prices);
        int count = 0;
        int sum = 0;
        
        for(int n : prices)
        {
            if(sum + n < k)
            {
                sum += n;
                count++;
            } else
            {
                break;
            }
        }
        
	System.out.println(count);
		
	}
}
