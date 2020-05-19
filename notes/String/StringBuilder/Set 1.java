import java.lang.StringBuilder.*;
import java.util.*;

public class Main
{
    
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //The StringBuilder append() function:
        
            //Simply appends the parameter inside it to the StringBuilder object.
        
            //The parameter can be a character within '', a boolean data type, char arrays, double/float/integer values, long, 
            //other objects, Strings, etc.
            
            StringBuilder str1 = new StringBuilder("Anubhav "); //Value of str1 = Anubhav 
            str1.append("Talukdar"); //Now value of str1 = Anubhav Talukdar
            
        //The int capacity() function:
        
            //Returns the current capacity of the StringBuilder object.
            
            StringBuilder str2 = new StringBuilder();
            System.out.println(str2.capacity());  //Prints the default capacity = 16.
            str2.append("Anubhav Talukdar");
            System.out.println(str2.capacity());  //O/P= 16.
            str2.append(", India.");
            System.out.println(str2.capacity());  //O/P= 34.
            System.out.println("str2 = "+str2);
            
        //The StringBuilder charAt() function:
            
            //Is used to return the character at the specified index of String contained by 
            //StringBuilder Object. The index value should lie between 0 and length()-1.
            
            char x = str2.charAt(0);
            System.out.println(x);
            
        //The StringBuilder delete(int start, int end) function:
            
            //Removes the characters starting from index start to index end-1. 
            
            str2.delete(0,8);
            System.out.println("After using delete function: "+str2);
            
        //The void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        
            //srcBegin: represents index on which we have to start copying.
            //srcEnd: represents index on which we have to stop copying.
            //dst: represents the array to copy the data into.
            //dstBegin: represents index of dest array we start pasting the copied data.
            
            StringBuilder str3 = new StringBuilder("evil dead_01");
            char[] c = new char[10];
            
            //Initialize all elements to underscore (_)
            Arrays.fill(c,'_');
            
            //get characters from index 5-9 and store in array start index 3
            str3.getChars(5,9,c,3);
            System.out.println("Char array:");
            for(int i=0; i<c.length; i++)
            {
                System.out.print(c[i]+" ");
            }
    }
}
