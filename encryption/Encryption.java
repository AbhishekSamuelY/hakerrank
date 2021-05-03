/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		String s = "feedthedog";
		
		s = s.replace("\\s", "");
		String[] strArr = s.split("");
		String str = "";

		int n = s.length();
		int jump=(int) Math.sqrt(n);
		if(jump*jump!=n){
		    jump++;
		}
		for(int i=0;i<jump;i++){
		    for(int j=i;j<n;j+=jump){
		    	str+=strArr[j];
		    }
		    str+=" ";
		}

		str = str.trim();
		System.out.println("'"+str+"'");
		System.out.println(str.length());
		
		
	}
}
