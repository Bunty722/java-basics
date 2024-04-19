public class CalcArea 
{
 double area;
 double length;
 double breadth;
 double height;
 double a ;
    double l;
    double b ;
    double h ;

 void kalyan()
 {
     a = area;
     l= length;
     b =breadth;
     h =height;

 }
}
class TriangleArea extends CalcArea
{
    void kalyan(double b,double h)
    {
        a=(b*h)/2;
        System.out.println(a);
    }
}
class SquareArea extends CalcArea
{
    void kalyan(double l)

    {
        a=l*l;
        System.out.println(a);
    }
}
class CalcAreaTest
{
    public static void main(String[]args)
    {
        TriangleArea kal=new TriangleArea();
        kal.kalyan(2,3);
        SquareArea kaly =new SquareArea();
        kaly.kalyan(5);
        
    }
}