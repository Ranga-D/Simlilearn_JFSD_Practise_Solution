/*Assisted Practice: 3.2 Demonstrate the Execution of sleep() and wait()
This section will guide you to: 
●	Write a program in Java to demonstrate sleep() and wait()
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three sub-sections, namely:
3.2.1	Creating a new project in Eclipse
3.2.2	Writing the program in Java to demonstrate sleep() and wait()
3.2.3	Pushing the code to your GitHub repositories


Step 3.2.1: Creating a new project in Eclipse
●	Open Eclipse
●	Go to File -> New -> Project -> Java Project -> Next.
●	Type in any project name and click on “Finish.”
●	Select your project and go to File -> New -> Class.
●	Enter MyClass in any class name, check the checkbox “public static void main(String[] args)”, and click on “Finish.”


Step 3.2.2: Writing the program in Java to demonstrate sleep() and wait()*/
public class MyClass 
{
    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (LOCK) 
        {
            LOCK.wait(1000);
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
        }
    }
}
