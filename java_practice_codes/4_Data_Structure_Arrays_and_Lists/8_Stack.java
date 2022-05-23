/*Assisted Practice: 4.8 Stack

This section will guide you to: 
●	Write a program in Java to insert and remove elements in a stack
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three subsections, namely:
4.8.1	Creating a new project in Eclipse
4.8.2	Writing the program in Java
4.8.3	Pushing the created files to Git


Step 4.8.1: Creating a new project in Eclipse 
●	Open Eclipse 
●	Go to File -> New -> Project -> Java Project -> Next
●	Type in any project name and click on Finish
●	Select your project and go to File -> New -> Class
●	Enter Stack in class name, check the checkbox public static void main(String args), and click on Finish

Step 4.8.2: Writing the program in Java
You need to write the program to insert and remove elements in a stack.
*/
public class Stack 
{ 
    	static final int MAX = 1000; 
    	int top; 
    	int a[] = new int[MAX];  
  	boolean isEmpty() 
    	{ 
        		return (top < 0); 
    	} 
    	Stack() 
    	{ 
        		top = -1; 
    	} 
  	boolean push(int x) 
    	{ 
        		if (top >= (MAX-1)) 
        		{ 
            			System.out.println("Stack Overflow"); 
            			return false; 
        		} 
        		else
        		{ 
            			a[++top] = x; 
            			System.out.println(x + " pushed into stack"); 
            			return true; 
        		} 
    	} 
int pop() 
    	{ 
        		if (top < 0) 
        		{ 
            			System.out.println("Stack Underflow"); 
            			return 0; 
        		} 
        		else
        		{ 
            			int x = a[top--]; 
            			return x; 
        		} 
    	} 
    
    	public static void main(String args[])
{
        		Stack s = new Stack(); 
        		s.push(10); 
        		s.push(20); 
        		s.push(30); 
        		System.out.println(s.pop() + " Popped from stack"); 
    	}
} 	
