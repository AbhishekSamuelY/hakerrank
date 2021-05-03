/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

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
