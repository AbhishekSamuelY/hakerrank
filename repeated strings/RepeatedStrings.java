/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedStrings {

	public static void main(String[] args) {

			String s = "a";
		long n = 1000000000000L; 
		
		long count = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == 'a')
                count++;
        }
        System.out.println("count1: "+count);
        long factor = n/s.length();
        long reminder = n % s.length();
        System.out.println(factor);
        System.out.println(reminder);
        
        count  *= factor;
        System.out.println("count1: "+count);
        for(int i = 0 ; i < reminder; i++)
        {
            if(s.charAt(i) == 'a')
                count++;
        }
        
        System.out.println(count);
	}
}
