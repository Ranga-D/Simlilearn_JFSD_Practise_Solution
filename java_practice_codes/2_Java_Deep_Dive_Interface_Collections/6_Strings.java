/*Assisted Practice: 2.6 Strings

This section will guide you to: 
●	Create a Java project in your IDE
●	Write a Java program to create strings and convert them into StringBuffer and StringBuilder


This lab has three subsections, namely:
2.6.1	Writing a program in Java to verify implementations of strings, StringBuffer, and StringBuilder
2.6.2	Executing the program and verifying working of strings
2.6.3	Pushing the code to your GitHub repositories


Step 2.6.1: Writing a program in Java to verify implementations strings, StringBuffer, and StringBuilder
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due to compatibility-related issues*/

public class stringDemo {

	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String sl=new String("Hello World");
		System.out.println(sl.length());

		//substring
		String sub=new String("Welcome");
		System.out.println(sub.substring(2));

		//String Comparison
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="Hello";
		System.out.println(s1.toLowerCase());
		
		//replace
		String s6="Heldo";
		String replace=s2.replace('d', 'l');
		System.out.println(replace);

		//equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		s.insert(0, 'w');
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);

		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}
