import java.util.Arrays;
import java.util.Scanner;
//The Arrays class is present in the java.util package

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    //Demonstrating the use of Arrays.copyOf() on an Integer array
	        
	        int arr[] = {23, 56, 67, 89, 43, 21, 56};
	        
	        int arr2[] = Arrays.copyOf(arr, arr.length-1);
	        
	        System.out.println(Arrays.toString(arr2));
	        
	        //Output: [23, 56, 67, 89, 43, 21, 56, 0, 0, 0]
	        
	    //Demonstrating the use of Arrays.copyOf() on a String array

		    String cities[] = {"Delhi", "Chennai", "Alaska", "Calcutta", "Madras", "Mumbai", "Amritsar"};
	        
	        String arr3[] = Arrays.copyOf(cities, cities.length+3);
	        
	        System.out.println(Arrays.toString(arr3));
	        
	        //Output: [Delhi, Chennai, Alaska, Calcutta, Madras, Mumbai, Amritsar, null, null, null]
	        
            
	    //Demonstrating the use of Arrays.copyOf() on a Character array
        
            char chars[] = {'x', 'f', 'c', 'a'};
            
            char arr4[] = Arrays.copyOf(chars, chars.length+3);
            
            System.out.println(Arrays.toString(arr4));
            
            //Output: [x, f, c, a, , , ]
            
        //Demonstrating the use of Arrays.copyOf() on a Double array
        
	        double dbl[] = {23, 56, 67, 89, 43, 21, 56};
	        
	        double dblCopy[] = Arrays.copyOf(dbl, dbl.length+3);
	        
	        System.out.println(Arrays.toString(dblCopy));
	        
	        //Output: [23.0, 56.0, 67.0, 89.0, 43.0, 21.0, 56.0, 0.0, 0.0, 0.0]
	        
		// copyOfRange(originalArray, startInclusiveIndex, endExclusiveIndex): Copies the specified range of the specified 			array into a new Array.
        //Demonstrating the use of Arrays.copyOfRange()
	        
	        double dbl2[] = Arrays.copyOfRange(dbl, 1, 4);
	        
	        System.out.println(Arrays.toString(dbl2));
	        
	        //Output: [56.0, 67.0, 89.0]
        
	}
}
