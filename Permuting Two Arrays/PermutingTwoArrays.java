/*
*Author: Abhishek Samuel Y
*Email: abhisheksamuel.y@gmail.com
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutingTwoArrays {

	public static void main(String[] args) {

	if(A.length != B.length)
            return "NO";

        Arrays.sort(A);
        Arrays.sort(B);
        
        int j = 0;
        for(int i = B.length-1; i >=0;i--)
        {
            if(A[j]+B[i] < k)
                return "NO";
            j++;
        }
        
        return "YES";
		
	}
}
