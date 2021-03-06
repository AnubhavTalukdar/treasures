import java.util.Arrays;
import java.util.Scanner;
//The Arrays class is present in the java.util package

//toString(originalArray):  This method returns a String representation of the contents of this Arrays. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters a comma followed by a space. Elements are converted to strings as by String.valueOf() function. 

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    //Demonstrating the use of Arrays.toString

            int arr[] = {20, 10, 35, 15, 22, 13, 17};
            System.out.println(Arrays.toString(arr));
            
            //Output: [20, 10, 35, 15, 22, 13, 17]
	}
}
