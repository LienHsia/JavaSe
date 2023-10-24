abstract class tuxing
{
    public tuxing()
    {
    System.out.println("i am tuxing");
    }
    public static void main(String[] dsa)
    {
    juxing j=new juxing();
    circle c=new circle();
    tuoyuan t=new tuoyuan();
    }
}
class juxing extends tuxing
{
    public juxing()
    {
    System.out.println(" i am juxing");
    }
}
class circle extends tuxing
{
    public circle()
    {
    System.out.println("i am circle");
    }
}
class tuoyuan extends circle
{
    public tuoyuan()
    {
    System.out.println("i am tuoyuan");
    }
}
