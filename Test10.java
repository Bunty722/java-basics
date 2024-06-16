public class Test10 implements Runnable
{
    public void run()
    {
        System.out.println("Thread has ended");
    }
    public static void main(String[]args)
    {
        Test10 kal =new Test10();
        Thread k1 = new Thread(kal);
        k1.start();
        System.out.println("hi");

    }
} 
