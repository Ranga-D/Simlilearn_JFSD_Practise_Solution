/*Assisted Practice: 5.4 Selection Sort

This section will guide you to: 
●	Create a Java class in your IDE 
●	Implement the selection sort algorithm in a predefined array 
●	Check if the element is available in the predefined array

This guide has three subsections, namely: 
5.4.1 Writing a program in Java implementing the selection sort algorithm
5.4.2 Executing the program to verify the execution of the selection sort algorithm 
5.4.3 Pushing the code to your GitHub repositories 


Step 5.4.1: Writing a program in Java implementing the selection sort algorithm 
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. Preferable is to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project 
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/
public class selectionSort {

    public static void main(String[] args) {

    int[] arr = {9,6,3,1,2,4,5};
    int length = arr.length;
    selectionSort(arr);
    System.out.println("The sorted elements are:");
    for(int i:arr){

        System.out.println(i);
         }
     }

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int smallNumber = arr[index];
            arr[index]= arr[i];
            arr[i]= smallNumber;
        }

    }
}
