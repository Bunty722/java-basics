import java.security.Principal;

class ItemQueue
{
    int item;
    boolean valueset=false;
    synchronized int getItem()
    {
        while(!valueset)
        {
            try{
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted excption caught");
            }
            System.out.println("consumed:"+item);
            valueset=false;
            try
            {
                Thread.sleep(1000);

            }
            catch(InterruptedException e)
            {
                System.out.println("Interyppted exception caught");
            }
            notify();
            return item;
        }
        synchronized void putItem
        {

        }

    }
}
