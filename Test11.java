import java.util.*;
public class Test11 
{

public static void main(String[] args) 
 {
  try
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two values");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 =n1/n2;
    System.out.println("division value="+n3);
  }
  catch (ArithmeticException Ae)
  {
    System.out.println("DONT ENTER ZERO FOR DENOMINATION");
  }
  catch (InputMismatchException ime)
  {
    System.out.println("pass only interger value......");
  }
  finally
  {
    System.out.println("i am from finally");
  }
 }   
}
