/*Assisted Practice: 5.2 Binary Search

This section will guide you to: 
●	Create a Java class in your IDE
●	Implement the binary search algorithm in a predefined array
●	Check if the element is available in the predefined array

This guide has three subsections, namely: 
5.2.1 Writing a program in Java implementing the binary search algorithm
5.2.2 Executing the program to verify the execution of the binary search algorithm
5.2.3 Pushing the code to your GitHub repositories 


Step 5.2.1: Writing a program in Java implementing the binary search algorithm 
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/
public class binarySearch {

    public static  void main(String[] args){


        int[] arr = {3,6,9,12,15};
        int key = 12;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }

public static void binarySearch(int[] arr, int start, int key, int length){

        int midValue = (start+length)/2;
        while(start<=length){

            if(arr[midValue]<key){

                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }

}

}
