import java.io.*;

public class Main
{
    
    //Study toLowerCase(), toUpperCase(), isLowerCase() & isUpperCase()
    
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "Geeks For Geeks";
		
		char x = str.charAt(4);
		System.out.println(x);
		
        // Prints 's'
        
        System.out.println(str.toUpperCase());
        
        // Prints "GEEKS FOR GEEKS"
        
        System.out.println(Character.isLowerCase(x));
        //Prints true
        
        System.out.println(Character.isUpperCase(x));
        //Prints false
		
	}
}
