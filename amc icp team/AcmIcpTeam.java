/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcmIcpTeam {

	public static void main(String[] args) {

String[] a = new String[3];
a[0] = "10101";
a[1] = "11110";
a[2] = "00010";

  List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < topic.length;i++)
        {
            if(i+1< topic.length)
            {
                for(int j = i+1; j < topic.length;j++)
                {
                    int count = 0;
                    for(int k = 0; k < topic[i].length(); k++)
                    {
                        if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1')
                        {
                          count++;  
                        }
                    }
                    //System.out.println(i+","+j+": "+count);
                    list.add(count);
                }
            }
        }
        
        int max = Collections.max(list);
        int counter = 0;
        for(int n : list)
        {
            if(n == max)
                counter++;
        }
        
        int[] result = new int[]{max,counter};
        
        for(int n : result)
        {
        	System.out.println(n);
	}
	
	}
}
