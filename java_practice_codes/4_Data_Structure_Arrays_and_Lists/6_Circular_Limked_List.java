/*Assisted Practice: 4.6 Circular Linked List

This section will guide you to: 
●	Write a program in Java to insert a new element in a sorted circular linked list
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three subsections, namely:
4.6.1	Creating a new project in Eclipse
4.6.2	Writing the program in Java
4.6.3	Pushing the created files to Git


Step 4.6.1: Creating a new project in Eclipse
●	Open Eclipse 
●	Go to File -> New -> Project -> Java Project -> Next
●	Type in any project name and click on Finish
●	Select your project and go to File -> New -> Class
●	Enter LinkedList in class name, check the checkbox public static void m
●	ain(String args), and click on Finish

Step 4.6.2: Writing the program in Java
You need to now write the program to insert a new element in a sorted circular linked list.*/

public class LinkedList 
{ 
    	static class Node 
    	{ 
  		int data; 
        		Node next; 
                	Node(int d) 
        		{ 
            			data = d; 
            			next = null; 
        		} 
}
Node head; 
LinkedList()   
{ 
head = null; 
} 
    	void sortedInsert(Node new_node) 
    	{ 
        		Node current = head; 
if (current == null) 
        		{ 
            			new_node.next = new_node; 
            			head = new_node; 
  		} 
else if (current.data >= new_node.data) 
        		{ 
while (current.next != head) 
                			current = current.next; 
  		 	current.next = new_node; 
            			new_node.next = head; 
            			head = new_node; 
        		} 
        		else
        		{
while (current.next != head && current.next.data < new_node.data) 
                			current = current.next; 
  			new_node.next = current.next; 
            			current.next = new_node; 
        		} 
	}
void printList() 
    	{ 
        		if (head != null) 
       		{ 
            			Node temp = head; 
            			do
           			{ 
                			System.out.print(temp.data + " "); 
                			temp = temp.next; 
            			}  while (temp != head); 
        		} 
    	}
public static void main(String[] args) 
    	{ 
        		LinkedList list = new LinkedList(); 
        		int arr[] = new int[] {12, 56, 2, 11, 1, 90}; 
        		Node temp = null; 
        		for (int i = 0; i < 6; i++) 
        		{ 
           			temp = new Node(arr[i]); 
            			list.sortedInsert(temp); 
        		} 
list.printList(); 
    	}		 
}
