/*Assisted Practice: 3.1 Programming the Threads Creation

This section will guide you to: 
●	Write a program in Java to create a thread by extending the ‘Thread’ class and by implementing the “Runnable” interface
●	Use Eclipse (the popular text editor for Java programs) 
●	Push code to Git

This lab has four sub-sections, namely:
3.1.1	Creating a new project in Eclipse
3.1.2	Writing a program in Java by extending the Thread class
3.1.3	Writing a program in Java by implementing the Runnable interface
3.1.4	Pushing the code to your GitHub repositories


Step 3.1.1: Creating a new project in Eclipse
●	Open Eclipse
●	Go to File -> New -> Project -> Java Project -> Next.
●	Type in any project name and click on “Finish.”
●	Select your project and go to File -> New -> Class.
●	Enter MyThread in class name, check the checkbox “public static void main(String[] args)”, and click on “Finish.”


Step 3.1.2: Writing a program in Java by extending the Thread class*/

public class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		MyThread mt = new  MyThread();
  		mt.start();
 	}
}
Output:
 

Step 3.1.3: Writing a program in Java by implementing the Runnable interface
●	Select your project and go to File -> New -> Class.
●	Enter MyRunnableThread in class name, check the checkbox “public static void main(String[] args)”, and click on “Finish.”



public class MyRunnableThread implements Runnable{
 
    public static int myCount = 0;
    public MyRunnableThread(){
         
    }
    public void run() {
        while(MyRunnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MyRunnableThread mrt = new MyRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(MyRunnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
