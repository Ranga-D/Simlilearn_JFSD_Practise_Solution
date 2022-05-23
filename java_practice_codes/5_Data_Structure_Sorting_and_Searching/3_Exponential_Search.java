/*Assisted Practice: 5.3 Exponential Search

This section will guide you to: 
●	Create a Java class in your IDE
●	Implement the exponential search algorithm in a predefined array
●	Check if the element is available in the predefined array

This guide has three subsections, namely: 
5.3.1 Writing a program in Java implementing the exponential search algorithm
5.3.2 Executing the program to verify the execution of the exponential search           algorithm
5.3.3 Pushing the code to your GitHub repositories


Step 5.3.1: Writing a program in Java implementing the exponential search algorithm 
There are two ways you can perform this step; you can create a new Java project, or you can create a new Java class in the existing project. It is preferable to create a new Java class in the existing project but feel free to explore the first option. The steps mentioned below will work once you create a project in Java. 
●	Open Eclipse
●	[Right click] on the src folder of the project 
●	Select New -> Java Class -> Enter the filename (follow camelCasing)
●	Execute the code below resolving the warning and errors due compatibility-related issues*/
import java.util.Arrays;

public class expSearch {

public static  void main(String[] args){

    int[] arr = {6,12,18,24,32};
    int length= arr.length;
    int value = 18;
    int outcome = exponentialSearch(arr,length,value);

    if(outcome<0){

       System.out.println( "Element is not present in the array");

    }else {

        System.out.println( "Element is  present in the array at index :"+outcome);
    }

        }

        public static int exponentialSearch(int[] arr ,int length, int value ){

        if(arr[0]==value){
            return 0;
            }
        int i=1;
        while(i<length && arr[i]<=value){

            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
        }


}
