/*Assisted Practice: 3.4 try-catch Statements
This section will guide you to: 
●	Write a program in Java to demonstrate try and catch
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three sub-sections, namely:
3.4.1	Creating a new project in Eclipse
3.4.2	Writing a program in Java to demonstrate try and catch
3.4.3	Pushing the code to your GitHub repositories


Step 3.4.1: Creating a new project in Eclipse
●	Open Eclipse
●	Go to File -> New -> Project -> Java Project -> Next.
●	Type in any project name and click on “Finish.”
●	Select your project and go to File -> New -> Class.
●	Enter MyClass in any class name, check the checkbox “public static void main(String[] args)”, and click on “Finish.”

Step 3.4.2: Writing a program in Java to demonstrate try and catch*/

public class MyClass 
{
    public static void main(String args[]) 
    {
        int[] array = new int[3];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }
}
