/*Assisted Practice: 5.6 Insertion Sort

This section will guide you to: 
●	Create a Java class in your IDE
●	Implement the insertion sort algorithm in a predefined array
●	Check if the element is available in the predefined array

This guide has three subsections, namely: 
5.6.1 Writing a program in Java implementing the insertion sort algorithm
5.6.2 Executing the program to verify the execution of the insertion sort algorithm
5.6.3 Pushing the code to your GitHub repositories


Step 5.6.1: Writing a program in Java implementing the insertion sort algorithm 
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/
public class insertionSort {

    public static  void main(String[] args){

        int[] arr = {9,12,3,21,44};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }
     }
    public static void insertionSort(int[] arr){

    int len = arr.length;
    for(int j=1;j<len;j++){
    int key = arr[j];
    int i=j-1;
    while ((i>-1) && (arr[i]>key)){

        arr[i+1]=arr[i];
        i--;
    }
    arr[i+1]=key;
         }

    }
}
