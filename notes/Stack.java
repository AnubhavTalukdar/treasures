//Learn push(), peek(), pop(), search(), empty()


import java.util.Stack;

public class Main
{
	public static void main(String[] args)
	{
	    Stack<Integer> stack = new Stack<Integer>();
	    
	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    
	    System.out.println("Position of 30: "+stack.search(30)); 
	    //Returns 1 i.e. top of the stack
	    
	    System.out.println("Position of 10: "+stack.search(10));
	    //Returns 3
	    
	    System.out.println("Element popped: "+stack.pop());
	    System.out.println("Element popped: "+stack.pop());
	    
	    System.out.println("Element at the top: "+stack.peek());
	    //Returns 10
	    
	    
	    System.out.println("Element popped: "+stack.pop());
	    
	    if(!stack.empty())
    	    stack.pop(); //Doesn't execute since the stack is empty
    	    
	    
	
	}
}
