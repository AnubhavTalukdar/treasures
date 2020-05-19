import java.util.Scanner;
//The StringBuilder class is present in the java.lang package


public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    //Inserts a number/character/String in the original String without replacing anything at the position determined 
	    //by the offset. The offset argument must be greater than or equal to 0, and less than or equal to the length of 
	    //this sequence.
	    
	    //Demonstrating the use of StringBuilder.insert(int offset, String c)
	    
    	    StringBuilder str = new StringBuilder("StackOverflow");
    	    str.insert(5, "Whoa");
    	    System.out.println(str);
    	    
    	    //Output: StackWhoaOverflow
    	    
	    //Demonstrating the use of StringBuilder.replace(int start, int end, String str)
	    
	        StringBuilder str1 = new StringBuilder("Stack Overflow.");
	        
	        str1.replace(0, 0, "We love ");
	        System.out.println(str1);
	        
	        //Output: We love Stack Overflow.
	        
	        str1.replace(0, str1.length(), "Do we?");
	        System.out.println(str1);
	        
	        //Output: Do we?
	        
	        //Here we can implement the insert() function 
	        str1.append(" Stack Overflow?");
	        str1.replace(5, 6, " really love");
	        System.out.println(str1);
	        
	        //Output: Do we really love Stack Overflow?
	        
	        
    	    
	    
	}
}
