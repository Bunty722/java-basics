class Ex2
{
    public void div (String s1,String s2)throws ArithmeticException,NumberFormatException
    {
        int n1 = Integer.parseInt(s1);
        int n2 =Integer.parseInt(s2);
        int n3 = n1/n2;
        System.out.println("division ="+n3);
    } 
}
class Ex3
{
    public static void main(String[]args)
    {
        try
        {
            String s1 = args[0];
            String s2 =args[1];
            Ex2 eo =new Ex2();
            eo.div(s1,s2);

        }
        catch(ArithmeticException Ae)
        {
            System.out.println("DONT ENTER ZERO FOR DENOMINATOR");
        }
        catch(NumberFormatException Nfe)
        {
            System.out.println("PASS INTERGER VALUE ");

        }
        catch(ArrayIndexOutOfBoundsException Aioobe)
        {
            System.out.println("PASS VALUES FROM COMMAND");
        }
    }
}