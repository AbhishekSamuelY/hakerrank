/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {

		String str = "We promptly judged antique ivory buckles for the next prize";
		String[] strArr = str.toLowerCase().split("");
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		List<String> letters = new ArrayList<>(Arrays.asList(alphabets.split("")));

		for(String letter : strArr)
		{
			if(letters.contains(letter))
				letters.remove(letter);
		}
		
		if(letters.size() > 0)
            return "not pangram";
        else
            return "pangram";

	}
}
