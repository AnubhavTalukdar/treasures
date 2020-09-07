//WAP to take the length of an array as an input, the array elements and a sum and return true if there are 
// any subsets the sum of whose items equal the sum.

import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int i, j;
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    int arr[] = new int[n];
	    
	    for(i=0;i<n;i++)
	    {
	        arr[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int sum = Integer.parseInt(br.readLine());
	    
	    
	    boolean T[][] = new boolean[n+1][sum+1];
	    
	    for(i=0;i<n+1;i++)
	    {
	        for(j=0;j<sum+1;j++)
	        {
                if(i==0)
	                T[i][j] = false;
	            if(j==0)
	                T[i][j] = true;
	        }
	    }
	    
	    
        for(i=1;i<n+1;i++)
	    {
	        for(j=1;j<sum+1;j++)
	        {
	            if(arr[i-1]>j)
	                T[i][j] = T[i-1][j];
                else
	                T[i][j] = T[i-1][j]||T[i-1][j-arr[i-1]];
	        }
	    }
	    
	   // This will print the 2D matrix
	    
	    
	   // for(i=0;i<n+1;i++)
	   // {
	   //     for(j=0;j<sum+1;j++)
	   //     {
	   //         System.out.print(T[i][j]+" ");
	   //     }
	   //     System.out.println();
	   // }
	   
	   
	   
	    System.out.println(T[n][sum]);
	    
	    
	    
	    
	    
	    
	    
	        
	    
	}
}
