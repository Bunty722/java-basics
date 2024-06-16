class Test<T1,T2>
{
    T1 a;
    T2 b;
    Test(T1 a,T2 b)
    {
        this.a=a;
        this.b=b;

    }
    //public void print()
    //{
      //  System.out.println(a);
        //System.out.println(b);
    //}
}
class Test14 
{
    public static void main(String[]args)
    {   
        Test<Integer,Integer>kal=new Test<Integer,Integer>(15,45);
        Test<Double,Integer>kaly=new Test<Double,Integer>(15.25,45);
        Test<Character,String>kalyan=new Test<Character,String>('c',"banti");
        System.out.println(a);
        System.out.println(b);

    }
}
