import java.io.*;

public class Main
{
    
    //Study toLowerCase(), toUpperCase(), isLowerCase(), isUpperCase(), isDigit()
    
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "Geeks For Geeks";
		
		char x = str.charAt(4);
		System.out.println(x);
		
        // Prints 's'
        
        System.out.println(str.toUpperCase());
        
        // Prints "GEEKS FOR GEEKS"
        
        System.out.println("Lowercase? "+Character.isLowerCase(x));
        //Prints: Lowercase? true
        
        System.out.println("Uppercase? "+Character.isUpperCase(x));
        //Prints: Uppercase? false
        
        System.out.println("Digit? "+Character.isDigit('3'));
        //Prints: Digit? true
        
        System.out.println("Whitespace? "+Character.isWhitespace(' '));
        //Prints: Whitespace? true
        
        
		
	}
}
