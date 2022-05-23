/*Assisted Practice: 1.1 Type Casting

This section will guide you to: 
●	Create a Java project in your IDE
●	Write a program in Java to perform implicit and explicit type casting



This lab has three subsections, namely:
1.1.1	Writing a program in Java to implement implicit and explicit type casting
1.1.2	Executing the program and verifying how the conversion of data types happen
1.1.3	Pushing the code to your GitHub repositories


Step 1.1.1: Writing a program in Java to implement implicit and explicit type casting
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the below code resolving the warning and errors due compatibility-related issues*/

public class typeCasting {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char a='A';
		System.out.println("Value of a: "+a);
		
		int b=a;
		System.out.println("Value of b: "+b);
		
		float c=a;
		System.out.println("Value of c: "+c);
		
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}



/*Step 1.1.2: Executing the program and verifying how the conversion of data types happen
Before you execute the program, check for syntactical corrections. If no errors are found, follow the steps mentioned below:
●	[Right click] in the program space
●	Select Run As Java Application
 


Step 1.1.3: Pushing the code to your GitHub repositories
●	Open your command prompt and navigate to the folder where you have created your files.
cd <folder path>
●	Initialize your repository using the following command:
git init
●	Add all the files to your git repository using the following command:
git add .
●	Commit the changes using the following command:
git commit .  -m “Changes have been committed.”
●	Push the files to the folder you initially created using the following command:
git push -u origin master*/