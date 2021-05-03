/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

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
