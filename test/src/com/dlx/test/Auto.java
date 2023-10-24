public class Auto
{
    public int luntai;
    public String color;
    public double weight;
    public int speed;
    public Auto(){}
    public void jiasu()
    {
    System.out.println("wo zai jiasu");
    }
    public void jiansu()
    {
    System.out.println("wo zai jiansu");
    }
    public void tingzhi()
    {
        System.out.println("wo bu kai le ");
    }
    public static void main(String[] dsa)
    {
    car c=new car();
    c.jiasu();
    c.jiansu();
    }
}
class car extends Auto
{
    public String air_condition;
    public String cd;
    public void jiasu()
    {
    System.out.println("wo shi jiaoche, wo zai jiasu");
    }
    public void jiansu()
    {
    System.out.println("wo shi jianche,wo zai jiansu");
    }
}
