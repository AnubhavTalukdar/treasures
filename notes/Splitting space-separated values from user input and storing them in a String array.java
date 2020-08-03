import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String str[] = br.readLine().split(" ");
	    int i, arr[] = new int[str.length];
	    
	    
	   // Converting all String inputs to numbers
	   
   	    for(i=0; i<str.length;i++)
	    {
	        arr[i] = Integer.parseInt(str[i]);
	    }
	        
	    
	    for(i=0; i<arr.length;i++)
	    {
	        System.out.println(arr[i]);
	    }

	}
}
