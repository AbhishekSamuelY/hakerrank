/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

public class HalloweenSale{

	public static void main(String[] args) {

		/*
		 * p: initial cost
		 * d: cost after previous purchase deduction
		 * m: limit deduction till
		 * m: price after limit
		 * s: your wallet
		 * */
		
		int p = 20;
		int d = 3;
		int m = 6;
		int s = 85;
		int unitsBrought = 0;
		
		while(s >= p) {
			unitsBrought++;
			s -= p;
			p = Math.max(p-d, m);
			System.out.println("remaining money: "+s);
		}
		
		System.out.println("units brought: "+unitsBrought);

		
	}
}
