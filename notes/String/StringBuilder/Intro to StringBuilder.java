import java.util.*;

public class Main
{
    
    String returningAString(String r)
    {
        StringBuilder sb = new StringBuilder("String changed");
        //return sb; <- doesn't work, since a StringBuilder is not a String
        return sb.toString();
        //Explicitly making the conversion yourself
    }
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //Ways to declare a StringBuilder Object:
        
            //Way 1:
            StringBuilder str = new StringBuilder();
            str.append("Anubhav");
            System.out.println(str); 
            //An object can be directly printed from s.o.pln. The toString() conversion isn't really needed. Its invoked implicitly.
            System.out.println("String: "+str); //println(String), plus compiler magic
            
            //Way 2:
            StringBuilder str1 = new StringBuilder("2 Paras");
            System.out.println("str1= "+str1);

            
            //Way 3:
            StringBuilder str2 = new StringBuilder(str1);
            System.out.println("str2= "+str2);
            
            //Way 4:
            StringBuilder str3 = new StringBuilder(10);
            System.out.println("str3 Capacity: "+str3.capacity());
            
        
        
        
    }
}
