/*Assisted Practice: 2.7 Arrays

This section will guide you to: 
●	Create a Java project in your IDE
●	Write a Java program to create arrays


This lab has three subsections, namely:
2.7.1	Writing a program in Java to verify implementation of arrays
2.7.2	Executing the program and verifying working of arrays
2.7.3	Pushing the code to your GitHub repositories


Step 2.7.1: Writing a program in Java to verify implementation of arrays
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/

public class arrayAssisted {

public static void main(String[] args) {

//single-dimensional array
int a[]= {10,20,30,40,50};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {2, 4, 6, 8}, 
            {3, 6, 9} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }
}
