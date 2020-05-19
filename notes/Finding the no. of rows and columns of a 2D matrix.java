import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows and columns");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        
        int r=arr.length, c=arr[0].length;
        
        
        System.out.println("No. of rows= "+r);
        System.out.println("No. of columns= "+c);
        
    }
}    
