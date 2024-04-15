import java.util.ArrayList;
import java.util.Scanner;
public class ArthimeticAverage{
    static double number1;
   static double number2;
    static double number3;
    static double average;

    static ArrayList<Double> MyNumbers=new ArrayList<Double>();
    public static void mymethod(){
     Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number 1:");
        number1=sc.nextInt();

        System.out.println("Enter the number 2:");
        number2=sc.nextInt();

        System.out.println("Enter the number 3:");
        number3=sc.nextInt();

    MyNumbers.add(number1);
    MyNumbers.add(number2);
    MyNumbers.add(number3);
       System.out.println("The User input Array is: "+MyNumbers);
}

  public static void AverageTest(){
    average=(number1+number2+number3)/3;
    System.out.println("The Average is: "+average);
}
 public static void main(String[] args){
    ArthimeticAverage myobj=new ArthimeticAverage();
    myobj.mymethod();
    myobj.AverageTest();
}
}
