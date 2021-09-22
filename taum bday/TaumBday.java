   
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
