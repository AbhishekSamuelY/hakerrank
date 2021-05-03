/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockSquares {

	public static void main(String[] args) {

		int a = 2;
		int b = 121;
		int x = 1;
		int n = 0;
		
		while(x*x < a)
			x++;
		while(x*x <= b)
		{
			n++;
			x++;
		}
		
		
		System.out.println(n);
	}
}
