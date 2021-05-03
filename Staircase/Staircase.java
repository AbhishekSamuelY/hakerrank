/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {

		int n = 5;
		for(int i = 0; i < n; i++){
             for(int k = 0; k < n-i-1; k++){
                    System.out.print(" ");
                }
            for(int j = 0; j < i+1; j++){
               
                System.out.print("#");
            }
            System.out.println();
        }
    

	}
}
