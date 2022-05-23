/*Assisted Practice: 2.2 Constructors

This section will guide you to: 
●	Create a Java project in your IDE
●	Write a program in Java to create constructors


This lab has three subsections, namely:
2.2.1	Writing a program in Java to verify the implementations of constructor types
2.2.2	Executing the program and verifying constructors
2.2.3	Pushing the code to your GitHub repositories


Step 2.2.1: Write a program in Java to verify the implementations of constructor types
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/

//default constructor
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class constructorDemo {

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	}
}

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class paramConstrDemo {
public static void main(String[] args) {

	Std std1=new Std(2,"Alex");
	Std std2=new Std(10,"Annie");
	std1.display();
	std2.display();
		}
}
