/*Assisted Practice: 5.1 Linear Search

This section will guide you to: 
●	Create a Java class in your IDE
●	Implement the linear search algorithm in a predefined array 
●	Check if the element is available in the predefined array

This guide has three subsections, namely: 
5.1.1 Writing a program in Java implementing the linear search algorithm
5.1.2 Executing the program to verify the execution of the linear search algorithm
5.1.3 Pushing the code to your GitHub repositories 


Step 5.1.1: Writing a program in Java implementing the linear search algorithm
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project 
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/

import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args){

        int[] arr = {10,20,30,40,50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int searchValue = sc.nextInt();
            int result = (int) linearing(arr,searchValue);

            if(result==-1){

                System.out.println("Element not in the array");
            } else {

                System.out.println("Element found at "+result+" and the search key is "+arr[result]);
            }


        }




public static int linearing(int arr[], int x) {

    int arrlength = arr.length;
    for (int i = 0; i < arrlength - 1; i++) {

        if (arr[i] == x) {

            return i;

         }
     }

            return -1;

   }

}
