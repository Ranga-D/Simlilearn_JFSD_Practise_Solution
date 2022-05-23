/*Assisted Practice: 3.9 The Diamond Problem
This section will guide you to: 
●	Write a program in Java to resolve the diamond problem using OOPs’ concepts
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three sub-sections, namely:
3.9.1	Creating a new project in Eclipse
3.9.2	Writing a program in Java to resolve the diamond problem using OOPs’ concepts
3.9.3	Pushing the code to your GitHub repositories

Step 3.9.1: Creating a new project in Eclipse
●	Open Eclipse
●	Go to File -> New -> Project -> Java Project -> Next.
●	Type in any project name and click on “Finish.”
●	Select your project and go to File -> New -> Class.
●	Enter TestClass in class name, check the checkbox “public static void main(String[] args)”, and click on “Finish.”

Step 3.9.2: Writing a program in Java to resolve the diamond problem using OOPs’ concepts*/

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class TestClass implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestClass ob = new TestClass(); 
        ob.show(); 
    } 
}
