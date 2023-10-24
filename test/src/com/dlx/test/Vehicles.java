public class Vehicles 
{
    public String brand;
    public String color;
    public void run()
    {
    System.out.println("i am running");
    }
    public Vehicles(String b, String b1)
    {
    this.brand=b;
    this.color=b1;
    }
    public void showInfo()
    {
    System.out.println("brand:"+this.brand+"\tcolor:"+this.color);
    }
    public static void main(String[] dad)
    {
    Vehicles lian=new Vehicles ("Lamborgihini","yellow");
    lian.showInfo();
    car c=new car("Aventador","green",6);
    c.showCar();
    Truck t=new Truck("Dongfangxuetielong","Bule",12);
    t.showTruck();
    }
}
class car extends Vehicles 
{
    public int seat;
    public void showCar()
    {
    System.out.println("i am a "+this.brand+"my color is "+this.color+"i have "+this.seat+"seats~");
    }
    public car(String b, String b1,int s)
    {
    super(b,b1);
    this.seat=s;
    }
}
class Truck extends Vehicles 
{
    public float load;
    public void showTruck()
    {
    System.out.println("i am a "+this.brand+"my color is "+this.color+"i can stand "+this.load+"tons of materials");
    }
    public Truck(String b, String b1,float f)
    {
    super(b,b1);
    this.load=f;
    }
}
