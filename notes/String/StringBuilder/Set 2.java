import java.util.Scanner;
//The StringBuilder class is present in the java.lang package


public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    //Demonstrating the use of StringBuilder.delete(int startInclusiveIndex, int endExclusiveIndex)
	    
	        StringBuilder str = new StringBuilder();
	        str.append("Anubhav");
	        
	        str.delete(2,6);
	        
	        System.out.println(str);
	        
	        //Output: Anv
	        
        //Demonstrating the use of StringBuilder.deleteCharAt(int index)
        
            StringBuilder str1 = new StringBuilder("Anubhav");
            
            str1.deleteCharAt(6);
            
            System.out.println(str1);
            
            //Output: Anubha
            
            
        //The indexOf(String str) method of StringBuilder class is the inbuilt method used to return the index 
        //within the String for first occurance of passed substring as parameter. If substring str is not 
        //present then -1 is returned.
        
        //Demonstrating the use of StringBuilder.indexOf(String str):
        
        
        
            String str2 = "Anubhav";
        
            StringBuilder str3 = new StringBuilder(str2);
            
            int pos = str3.indexOf("bh");
            System.out.println(pos);
            
            //Output: 3
            
        //Demonstrating the use of StringBuilder.indexOf(String str, int startInclusiveIndex):
        
            StringBuilder str4 = new StringBuilder("GeeksForGeeks");
            
            System.out.println(str4.indexOf("Geeks", 2));
            
            //Output: 8
            
            
        //Demonstrating the use of StringBuilder.length():
        
            System.out.println(str4.length());
            
            //Output: 13
            
            
        //The lastIndexOf(String str) method of StringBuilder class is the inbuilt method used to return the index
        //within the String for last occurance of passed substring as parameter. The last occurrence of the empty 
        //string “” is considered to occur at the index value this.length(). If substring str is not present then 
        //-1 is returned.
            
        //Demonstrating the use of StringBuilder.lastIndexOf(String str):
        
        
            
            System.out.println(str4.lastIndexOf("Geeks"));
            
            //Output: 8
        
        //Demonstrating the use of StringBuilder.lastIndexOf(String str, int index):
            StringBuilder str5 = new StringBuilder("WeGeeksLoveGeeksForGeeks");
            System.out.println(str5.lastIndexOf("Geeks", 15));
            
            //Output: 11
	}
}
