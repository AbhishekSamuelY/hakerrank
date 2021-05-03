/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaumBday {

	public static void main(String[] args) {


        int b = 5;
        int w = 9;
        int bc = 2;
        int wc = 3;
        int z = 4;
        		long result = 0;
		
		int bg = 0;
		int wg = 0;
		
		//cost of black gift == cost of white gift
        if(bc == wc)
        {
        	bg = b*bc;
        	wg = w*wc;
            result = bg+wg;
        } 
        //cost of conversion of white gift < cost of white gift
        else if(w*(bc+z) < w*wc)
        {
        	bg = b*bc;
        	wg = w*(bc+z);
        	result = bg+wg;
        } 
        //cost of conversion of black gift < cost of black gift
        else if(b*(wc+z) < b*bc)
        {
        	bg = b*(wc+z);
        	wg = w*wc;
        	result = bg+wg;
        }
        //cost of conversion of black gift == cost of conversion of white gift
        else if(b*(wc+z) == w*(bc+z))
        {
        	bg = b*bc;
        	wg = w*wc;
            result = bg+wg;
            
        }
        //cost of conversion of white == cost of white
        else if(wc+z > bc && w*(bc+z) == w*wc)
        {
        	bg = b*bc;
        	wg = w*wc;
            result = bg+wg;
        } 
      //cost of conversion of black == cost of black
        else if(bc+z > wc && b*(wc+z) == b*bc)
        {
        	bg = b*bc;
        	wg = w*wc;
            result = bg+wg;
        } 
      //cost of black conversion > cost of white conversion && cost of white conversion > cost of black conversion
        else if(bc+z > wc || wc+z > bc)
        {
        	bg = b*bc;
        	wg = w*wc;
            result = bg+wg;
        } 
        

	System.out.println(result);
        
        System.out.println((long)b*Math.min(bc, wc+z) + (long)w*Math.min(wc,bc+z));

	
	}
}
