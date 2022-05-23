/*Assisted Practice: 3.6 Implement the Exception Handlers
This section will guide you to: 
●	Write a program in Java to demonstrate exception handling
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three sub-sections, namely:
3.6.1	Creating a new project in Eclipse
3.6.2	Writing a program in Java to demonstrate exception handling
3.6.3	Pushing the code to your GitHub repositories

Step 3.6.1: Creating a new project in Eclipse
●	Open Eclipse
●	Go to File -> New -> Project -> Java Project -> Next.
●	Type in any project name and click on “Finish.”
●	Select your project and go to File -> New -> Class.
●	Enter Example1 class name, check the checkbox “public static void main(String[] args)”, and click on “Finish.”

Step 3.6.2: Writing a program in Java to demonstrate exception handling*/

class MyException extends Exception{
   String str1;
   MyException(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("MyException Occurred: "+str1) ;
   }
}
class Example1{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new MyException("This is My error Message");
	}
	catch(MyException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}
