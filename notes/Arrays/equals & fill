import java.util.Arrays;
import java.util.Scanner;
//The Arrays class is present in the java.util package

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
	        
        //Partially filling an array:
	        
            int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2}; 
  
            // Fill from index 1 to index 4. 
            Arrays.fill(ar, 1, 5, 10); 
         
            System.out.println(Arrays.toString(ar));
            
            //Output: [2, 10, 10, 10, 10, 2, 2, 2, 2]
	    
	    
	}
}
