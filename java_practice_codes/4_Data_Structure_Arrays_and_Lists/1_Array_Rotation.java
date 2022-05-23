/*Assisted Practice: 4.1 Array Rotation
This section will guide you to: 
●	Write a program in Java to right rotate an array by 5 steps
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has three subsections, namely:
4.1.1	Creating a new project in Eclipse
4.1.2	Writing the program in Java for array rotation
4.1.3	Pushing the code to your GitHub repositories


Step 4.1.1: Creating a new project in Eclipse 
●	Open Eclipse
●	Go to File -> New -> Project -> Java Project -> Next
●	Type in any project name and click on Finish
●	Select your project and go to File -> New -> Class
●	Enter Main in any class name, check the checkbox public static void main(String[] args), and click on Finish.


Step 4.1.2: Writing a program in Java for array rotation*/

class RotateArray { 
public void rotate(int[] nums, int k) {
    		if(k > nums.length) 
       			k=k%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < k; i++){
        			result[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<nums.length; i++){
        			result[i] = nums[j];
j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class Main
{
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
