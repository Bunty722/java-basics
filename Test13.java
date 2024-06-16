import java.util.*;



public class Test13 
{
 public static void main(String[]args)
 {
    ArrayList<String>list = new ArrayList<String>();
    list.add("kalyan");
    list.add("ram");
    list.add("mom");
    //travelling list through iterator
    Iterator itr=list.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }

 }   
}
