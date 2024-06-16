import java.util.Scanner;

class MultithreadingDemo extends Thread 
{
    public void run()
    {
        try
        {
            // display the that is running
            System.out.println("Thread"+" "+
            
            
            
            
            
            Thread.currentThread().getId()+"is running");
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}
public class Test15
{
    public static void main(String[]args)
    {
        int n;
        Scanner kal=new Scanner(System.in);
        System.out.println("enter the thread size");
        n = kal.nextInt();
        for(int i=0;i<n;i++)
        {
            MultithreadingDemo kalyan=new MultithreadingDemo();
            kalyan.start();
        }


    }
}

