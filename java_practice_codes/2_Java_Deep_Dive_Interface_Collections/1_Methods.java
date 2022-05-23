/*Assisted Practice: 2.1 Methods

This section will guide you to: 
●	Create a Java project in your IDE 
●	Write a program in Java to create methods


This lab has three subsections, namely:
2.1.1	Writing a program in Java to verify implementations of methods and ways of calling a method
2.1.2	Executing the program and verifying working of methods
2.1.3	Pushing the code to your GitHub repositories


Step 2.1.1: Writing a program in Java to verify implementations of methods and ways of calling a method
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due to compatibility-related issues*/

//method demo
public class methodExecution {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}

public static void main(String[] args) {

	methodExecution b=new methodExecution();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}


//call by value
public class callMethod {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public static void main(String args[]) {
	callMethod d = new callMethod();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	}
}



//method overloading
public class overloadMethod {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

overloadMethod ob=new overloadMethod();
       ob.area(10,12);
       ob.area(5);  
   }
}
