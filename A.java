import java.util.ArrayList;
public class Indian_satellites 
{
    void Names()
    {
      ArrayList<String>Satellite_Name= new ArrayList<String>();
      Satellite_Name.add("AraybattaS");
      Satellite_Name.add("bhA");
      Satellite_Name.add("ROHINI");
      Satellite_Name.add("IRS");
      Satellite_Name.add("CAR");
      Satellite_Name.add("RIS");
      Satellite_Name.add("EOS");
    }
    void display_sat()
    {
        
        Satellite_Name.remove(0);
        Satellite_Name.remove(1);
        Satellite_Name.remove(2);
        Satellite_Name.remove(3);
        System.out.println("not in opretional");
        Satellite_Name.set(4,"2f");
        Satellite_Name.set(5,"3f");
        System.out.println(Satellite_Name);
        Satellite_Name.sort();

    }
    
}
public class A
{
    public static void main(String[] args) {
        A b=new A();
        b.display_sat();
    }
}
