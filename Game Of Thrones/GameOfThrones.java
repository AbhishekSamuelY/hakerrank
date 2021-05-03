/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameOfThrones {

	public static void main(String[] args) {

		String s = "aaabbbb";
		char[] charArr = new char[26];

		for (int i = 0; i < s.length(); i++) {
			charArr[s.charAt(i) - 97]++;
		}

		int oddCount = 0;

		for (int i = 0; i < 26; i++) {
			if (charArr[i] % 2 != 0) {
				oddCount++;
			}

		}
		if(oddCount > 1)
			System.out.println("NO");
		else
			System.out.println("YES");

		
	}
}
