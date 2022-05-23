/*Assisted Practice: 2.4 Map

This section will guide you to: 
●	Create a Java project in your IDE
●	Write a program in Java to create maps

This lab has three subsections, namely:
2.4.1 Writing a program in Java to verify implementations of maps
2.4.2 Executing the program and verifying it is working
2.4.3 Pushing the code to your GitHub repositories


Step 2.4.1: Writing a program in Java to verify implementations of maps
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/

import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tim");    
	      hm.put(2,"Mary");    
	      hm.put(3,"Catie");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Annie");    
	      map.put(9,"Carlotte");    
	      map.put(10,"Catie");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
