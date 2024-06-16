public class Vehcle
{protected String brand ="ford";
 public void kalyan(){
    System.out.println("kalyan is great");
 }
}
class car extends Vehcle
{private String modelname = "volgo";

public static void main(String[]args)
{car mycar =new car();

    mycar.kalyan();
}
}