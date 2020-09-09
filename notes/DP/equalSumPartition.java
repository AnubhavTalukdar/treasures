import java.io.*;

public class Main
{
    static boolean isSubsetSum(int arr[], int sum, int n)
    {
        boolean T[][] = new boolean[n+1][sum+1];
        int i, j;
        
        for(i=0; i<n+1;i++)
        {
            for(j=0; j<sum+1;j++)
            {
                if(j==0)
                    T[i][j] = true;
                if(i==0)
                    T[i][j] = false;
            }
        }
        
        for(i=1; i<n+1;i++)
        {
            for(j=1; j<sum+1;j++)
            {
                if(j<arr[i-1])
                {
                    T[i][j] = T[i-1][j];
                }
                else
                {
                    T[i][j] = T[i-1][j] || T[i-1][j-arr[i-1]];
                }
            }
        }
        
        return T[n][sum];
        
        
    }

    
	public static void main(String[] args)throws IOException 
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int i, j, sum=0;
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    int arr[] = new int[n];
	    
	    for(i=0;i<n;i++)
	    {
	        arr[i] = Integer.parseInt(br.readLine());
	        sum+=arr[i];
	    }
	    
	    if(sum%2==0)
        {
            System.out.println(isSubsetSum(arr, sum/2, n));
        }
        else
        {
            System.out.println(false);
        }
	    
	}
}
