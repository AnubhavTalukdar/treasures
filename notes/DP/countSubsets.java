//14:04

import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException 
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int i,j;
	    
	    int n = Integer.parseInt(br.readLine());
	    int arr[] = new int[n];
	    
	    for(i=0;i<n;i++)
	    {
	        arr[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int sum = Integer.parseInt(br.readLine());
	    
	    int T[][] = new int[n+1][sum+1];
	    
	    //Init
	    
	    for(i=0;i<n+1;i++)
	    {
	        for(j=0;j<sum+1;j++)
	        {
                if(i==0)
	                T[i][j] = 0;
	            if(j==0)
	                T[i][j] = 1;
	        }
	    }
	    
	    //DP
	    
	    for(i=1;i<n+1;i++)
	    {
	        for(j=1;j<sum+1;j++)
	        {
	            if(arr[i-1]>j)
	                T[i][j] = T[i-1][j];
                else
    	            T[i][j] = T[i-1][j] + T[i-1][j-arr[i-1]];
	        }
	    }
	    
	    
	    //The final matrix:
	    
	    for(i=0;i<n+1;i++)
	    {
	        for(j=0;j<sum+1;j++)
	        {
	            System.out.print(T[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	    //The count:
	    System.out.println(T[n][sum]);
	    
	}
}
