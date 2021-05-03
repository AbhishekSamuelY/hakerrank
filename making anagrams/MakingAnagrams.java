/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) {

		String s1 = "cde";
		String s2 = "abc";
		
	int count = 0;
        char[] charArr1 = new char[26];
        char[] charArr2 = new char[26];
        
        for(int i = 0; i < s1.length(); i++)
        {
            charArr1[s1.charAt(i)-97]++;
        }
        for(int i = 0; i < s2.length(); i++)
        {
            charArr2[s2.charAt(i)-97]++;
        }
        
        for(int i = 0; i < 26; i++)
        {
            count+=Math.abs(charArr1[i]-charArr2[i]);
        }
        
		System.out.println(count);
		
	}
}
