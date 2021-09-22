   
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

public class AppendAndDelete{

	public static void main(String[] args) {

String s = "ashley";
		String t = "ash";
		int k = 2;
		int total = 0;
		
		
		for(int i = 0; i < Math.min(s.length(), t.length()); i++) {
			if(s.charAt(i) == t.charAt(i)) {
				total++;
			} else {
				break;
			}
		}
		
		/*
		 * case 1:
		 * k > str1 - str2
		 * s = "123456" t = "1" k = 2
		 * case 2:
		 * k <= str1-str2 => k(even/odd) <= str1.length+str2.length(even/odd)
		 * s = "010101" t = "01010" k = even number
		 * s = "010101" t = "010101" k = odd number
		 * case 3:
		 * s = "1" t = "101" k = 5
		 * delete all characters in t and add required character will still be possible k times
		 * delete all characters and add the required character to match
		 * case 4:
		 * all other cases will fail
		 * */
		if((s.length()+t.length()-2*total)>k) {
			System.out.println("No");
		} else if((s.length()+t.length()-2*total)%2==k%2){
			System.out.println("Yes");
		} else if((s.length()+t.length()-k)<0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
