   
/*
 
       d8888 888888b.   888    888 8888888 .d8888b.  888    888 8888888888 888    d8P   .d8888b.        d8888 888b     d888 888     888 8888888888 888    Y88b   d88P 
      d88888 888  "88b  888    888   888  d88P  Y88b 888    888 888        888   d8P   d88P  Y88b      d88888 8888b   d8888 888     888 888        888     Y88b d88P  
     d88P888 888  .88P  888    888   888  Y88b.      888    888 888        888  d8P    Y88b.          d88P888 88888b.d88888 888     888 888        888      Y88o88P   
    d88P 888 8888888K.  8888888888   888   "Y888b.   8888888888 8888888    888d88K      "Y888b.      d88P 888 888Y88888P888 888     888 8888888    888       Y888P    
   d88P  888 888  "Y88b 888    888   888      "Y88b. 888    888 888        8888888b        "Y88b.   d88P  888 888 Y888P 888 888     888 888        888        888     
  d88P   888 888    888 888    888   888        "888 888    888 888        888  Y88b         "888  d88P   888 888  Y8P  888 888     888 888        888        888     
 d8888888888 888   d88P 888    888   888  Y88b  d88P 888    888 888        888   Y88b  Y88b  d88P d8888888888 888   "   888 Y88b. .d88P 888        888        888     
d88P     888 8888888P"  888    888 8888888 "Y8888P"  888    888 8888888888 888    Y88b  "Y8888P" d88P     888 888       888  "Y88888P"  8888888888 88888888   888     
======================================================================================================================================================================
email: abhisheksamuel.y@gmail.com
github: abhisheksamuely@github
                                                                                                                                                                                                                                                                              
*/
package com.abhisheksamuely.hakerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HappyLadybugs {

	public static void main(String[] args) {

String b = "RBY_YBR";

		Map<Character, Integer> color = new HashMap<Character, Integer>();

		for (int i = 0; i < b.length(); i++) {
			Character ch = b.charAt(i);

			if (color.containsKey(ch)) {
				color.put(ch, color.get(ch) + 1);
			} else {
				color.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> frequency : color.entrySet()) {
			if (frequency.getValue() < 2 && !frequency.getKey().equals((Character) '_')) {
				System.out.println("NO");
			}
		}

		if (!color.containsKey('_')) {
			int count = 0;
			char last = b.charAt(0);

			for (int i = 0; i < b.length(); i++) {
				char curr = b.charAt(i);

				if (curr == last) {
					count++;
				} else {
					if (count < 2) {
						System.out.println("NO");
					} else {
						count = 1;
					}
				}
				last = curr;
			}
			System.out.println("YES");
		} else {
			System.out.println("YES");
		}

	}
}
