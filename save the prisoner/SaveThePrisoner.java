/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {

	int n = 352926151;
		int m = 380324688;
		int s = 94730870;
		int last = 0;
		
		for(int i = s; i <= n; i++)
		{
			if(m > 0)
			{
				m--;
				if(i == n && m != 0)
				i = 0;
				
			} if(m == 0)
			{
				last = i;
				break;
			}
		}
		System.out.println(last);
		//return ((m-1)+(s-1))%n+1;
	}
}
