/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateTheNumbers {

	public static void main(String[] args) {

	String s = "1234";
		boolean valid = false;
		long firstx = -1;
		
		for(int i = 1; i <= s.length()/2;++i)
		{
			long x = Long.parseLong(s.substring(0, i));
			firstx = x;
			String test = Long.toString(x);
			while(test.length() < s.length())
			{
				test += Long.toString(++x);
			}
			if(test.equals(s)){
				valid = true;
				break;
			}
		}
		
		System.out.println(valid ? "YES " + firstx : "NO");
	}
}
