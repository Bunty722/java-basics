import java.util.Scanner;
interface area
{
 public void dimensions();
 public void area();
}
class Rectangle implements area
{
 int length,breadth,area;
 public void dimensions() 
 {
 Scanner s=new Scanner(System.in);
 System.out.print("Enter length:");
 length=s.nextInt();
 System.out.print("Enter breadth:");
 breadth=s.nextInt();
 }
 public void area() 
 {
 area=length*breadth;
 System.out.println("Area of rectangle:"+area);
 }
}
class Square implements area
{
 int length,area;
 public void dimensions() 
 {
 Scanner s=new Scanner(System.in);
 System.out.print("Enter length:");
 length=s.nextInt();
 }
 public void area() 
 {
 area=length*length;
 System.out.print("Area of square:"+area);
 }
}
class Test8
{
 public static void main(String[] args) 
 {
 Rectangle obj=new Rectangle();
 obj.dimensions();
 obj.area();
 Square obj2=new Square();
 obj2.dimensions();
 obj2.area();
 }
}