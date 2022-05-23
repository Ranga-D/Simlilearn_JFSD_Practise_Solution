/*Assisted Practice: 2.8 Regular Expressions

This section will guide you to: 
●	Create a Java project in your IDE
●	Write a Java program to search a specific string from a given set of strings using regular expressions


This lab has three subsections, namely:
2.8.1	Writing a program in Java to verify implementations of regular expressions
2.8.2	Executing the program and verifying working of regular expressions
2.8.3	Pushing the code to your GitHub repositories


Step 2.8.1: Writing a program in Java to verify implementations of regular expressions
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/

import java.util.regex.*;

public class regularExpnAssisted {

public static void main(String[] args) {

	String pattern = "[a-z]+";
	String check = "Regular Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
