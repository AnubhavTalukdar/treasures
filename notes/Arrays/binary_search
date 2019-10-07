import java.util.Arrays;
import java.util.Scanner;
//The Arrays class is present in the java.util package

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    //Demonstrating the use of Arrays.binarySearch()
	    
	    //Important points:
	        //1. Array must be sorted before initiating the search.
	        //2. This function returns the index of the element to be searched.
	        //3. If element not found, result < 0.
	    
	    //Example 1
            char arr[] = {'x', 'f', 'c', 'a'};
            Arrays.sort(arr);
            // arr[] = {'a', 'c', 'f', 'x'}
            
            System.out.println(Arrays.binarySearch(arr, 'c'));
            //Output: 1
        
        //Example 2
            int intArr[] = { 10, 20, 15, 22, 35 }; 
            Arrays.sort(intArr);
            
            int key = sc.nextInt(), pos;
            pos = Arrays.binarySearch(intArr, key);
            
            if(pos>0)
                System.out.println("Position of "+key+" = "+(++pos));
            else
                System.out.println(key+" not found.");
        
	}
}
