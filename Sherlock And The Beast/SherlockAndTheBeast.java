/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndTheBeast {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder();
		int n = 11;
		
		for(int i = n; i >= 0; i-=5)
		{
			if(i%3==0 && (n-i) % 5 == 0)
			{
				for(int k = 0; k < i; k++)
					str.append(5);
				for(int k = 0; k < n-i; k++)
					str.append(3);
				break;
			}
		}
		
		if(str.length() < 1)
			System.out.println(-1);
		else
			System.out.println(str);
		
	}
}
