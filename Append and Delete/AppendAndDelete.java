/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

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
