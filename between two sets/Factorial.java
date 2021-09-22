   
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

public class Factorial {

	public static void main(String[] args) {

		List<Integer> commonFacts = new ArrayList<Integer>();
        for(int i = 2; i <= b.get(b.size()-1); i++)
        {
            List<Integer> facts = facts(i);
            int counter = 0;
            for(int n : facts)
            {
                if(a.contains(n))
                    counter++;
            }
            if(counter == a.size())
            {
                int count = 0;
                for(int n : b)
                {
                    List<Integer> factorial = facts(n);
                    if(factorial.contains(i))
                        count++;
                }
                if(count == b.size())
                    commonFacts.add(i);
            }
        }
        System.out.println(commonFacts.size());
	}
	}
	public static List<Integer> facts(int n)
	{
		List<Integer> facts = new ArrayList<Integer>();
		for(int i = 2; i <= n; i++)
		{
			if(n%i==0)
				facts.add(i);
		}
		
		return facts;
	}

}
