import java.util.Arrays;
import java.util.Scanner;
//The Arrays class is present in the java.util package
//See Arrays.equals(), Arrays.fill() for both 1-D arrays and 2-D arrays.

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    //Demonstrating the use of Arrays.equals
	    
            double intArr[] = { 10, 20, 15, 22, 35 }; 
            double intArr1[] = { 10, 15, 22, 20, 35 };
            
            Arrays.sort(intArr1);
            Arrays.sort(intArr);
            
            boolean equality = Arrays.equals(intArr, intArr1);
            
            if(equality)
                System.out.println("Arrays equal.");
            else
                System.out.println("Arrays not equal.");
                
            //Output: Arrays equal.
            
	    	//Demonstrating the use of Arrays.fill on a double array with an Integer value
            int intKey = 22;
            Arrays.fill(intArr, intKey); 
      
            System.out.println("Integer Array on filling: "+ Arrays.toString(intArr)); 	
            
            //Output: Integer Array on filling: [22.0, 22.0, 22.0, 22.0, 22.0]
            
            
	    	//Demonstrating the use of Arrays.fill on a String array	    
	        String cities[] = {"Delhi", "Chennai", "Alaska", "Calcutta", "Madras", "Mumbai", "Amritsar"};
	        Arrays.fill(cities, "nada");
	        
	        System.out.println(Arrays.toString(cities));
	        
	        //Output: [nada, nada, nada, nada, nada, nada, nada]
		
		
			//Arrays.fill() in 2-D arrays:
			int arr[][] = new int[4][4];
			
			// Using an advanced for-loop to fill in the elements. In an advanced for-loop, the part on the left of the semi-colon represents the data that will 
			// be considered for each iteration. As in the data we'll work on at each iteration. Here we take a row at a time and that row is temporarily stored 
			// in the variable row[]. Value of row[] will change on each iteration. But before every iteration, we'll use the Arrays.fill to fill each row with a 
			// value. Here, its -1. The value to the right of the semi-colon in the advanced for-loop, indicates the DDA, SDA, or the ArrayList we want to iterate through. 
		
			for(int row[]: arr)
			{
				Arrays.fill(row, -1);
			}
		
			//Here also the same things happen. But instead of filling it with constant values, each row is fed into the Arrays.toString() function and is simply printed
		
			for(int row[]: arr)
			{
				System.out.println(Arrays.toString(row));
			}

		
	        
        //Partially filling an array:
	        
            int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2}; 
  
            // Fill from index 1 to index 4. 
            Arrays.fill(ar, 1, 5, 10); 
         
            System.out.println(Arrays.toString(ar));
            
            //Output: [2, 10, 10, 10, 10, 2, 2, 2, 2]
	    
	    
	}
}
