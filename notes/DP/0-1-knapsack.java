// WAP for 0/1 Knapsack
// Input:
// <no. of elements>
// <array of elements representing weight>
// <array of elements representing corresponding value>
// <Knapsack capacity>
//
// Output:
// <Maximum profit>

import java.io.*;



public class Main
{
	public static void main(String[] args)throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int i, j;
	    int n = Integer.parseInt(br.readLine());
	    
	    int wt[] = new int[n];
	    for(i=0;i<n;i++)
	    {
	        wt[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int val[] = new int[n];
	    for(i=0;i<n;i++)
	    {
	        val[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int W = Integer.parseInt(br.readLine());
	    
	    int T[][] = new int[n+1][W+1];
	    
	    
	    //Initialisation of 2D matrix:
	    
	    
	    for(i=0;i<n+1;i++)
	    {
	        for(j=0;j<W+1;j++)
	        {
	            if(i==0||j==0)
    	            T[i][j] = 0;
	        }
	    }
	    
	    
	    //DP
	    
	    for(i=1;i<n+1;i++)
	    {
	        for(j=1;j<W+1;j++)
	        {
	            if(wt[i-1]>j)
	                T[i][j] = T[i-1][j];
                else
                    T[i][j] = Math.max(val[i-1]+T[i-1][j-wt[i-1]], T[i-1][j]);
	        }
	    }
	    
	    System.out.println(T[n][W]);
	    
	    
	    
	    
	}
}
