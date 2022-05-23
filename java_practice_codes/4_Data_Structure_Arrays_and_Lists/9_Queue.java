/*Assisted Practice: 4.9 Queue

This section will guide you to: 
●	Write a program in Java to insert and remove elements in a queue
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three subsections, namely:
4.9.1	Creating a new project in Eclipse
4.9.2	Writing the program in Java
4.9.3	Pushing the created files to Git


Step 4.9.1: Creating a new project in Eclipse 
●	Open Eclipse 
●	Go to File -> New -> Project -> Java Project -> Next
●	Type in any project name and click on Finish
●	Select your project and go to File -> New -> Class
●	Enter QueueExample in class name, check the checkbox public static void main(String args), and click on Finish

Step 4.9.2: Writing the program in Java
You need to write the program to insert and remove elements in a queue.*/
import java.util.*;

public class QueueExample 
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("Kolkata");
        		locationsQueue.add("Patna");
        		locationsQueue.add("Delhi");
        		locationsQueue.add("Gurgaon");
        		locationsQueue.add("Noida");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}
