/*Assisted Practice: 5.5 Bubble Sort

This section will guide you to: 
●	Create a Java class in your IDE 
●	Implement the bubble sort algorithm in a predefined array 
●	Check if the element is available in the predefined array

This guide has three subsections, namely: 
5.5.1 Writing a program in Java implementing the bubble sort algorithm
5.5.2 Executing the program to verify the execution of the bubble sort algorithm 
5.5.3 Pushing the code to your GitHub repositories 


Step 5.5.1: Writing a program in Java implementing the bubble sort algorithm 
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project 
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/
public class bubbleSort {


    public static void main(String[] args){

     int[] arr= {25,20,15,5,10};
     bubbleSort(arr);
     for(int i=0;i<arr.length;i++){

        System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        int temp = 0;
        for(int i=0;i<len;i++){
            for (int j=1;j<(len);j++){
                if(arr[j-1]>arr[j]){
                temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;

                }


            }

        }

    }

}
