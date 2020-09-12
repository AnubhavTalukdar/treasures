// The Integer class:

// 1. Decimal to Binary converter
// 2. Integer to Hexadecimal
// 3. Integer to Octal


import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args)throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    // 1. Decimal to Binary converter
	    
	    int n = Integer.parseInt(br.readLine());
	    //Input: 50
	    
	    System.out.println("Binary equivalent of "+n+" = "+Integer.toBinaryString(n));
	    //Output: Binary equivalent of 50 = 110010
	    
	   // 2. Integer to Hexadecimal
	   
   	   System.out.println("Hexadecimal equivalent of "+n+" = "+Integer.toHexString(n));
	   //Output: Hexadecimal equivalent of 50 = 32
	   
	   
   	   // 3. Integer to Octal
	   
  	   System.out.println("Octal equivalent of "+n+" = "+Integer.toOctalString(n));
	   //Output: Octal equivalent of 50 = 62
	    
	}
}

