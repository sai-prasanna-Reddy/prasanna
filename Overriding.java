public class Overriding {
    public static void main(String[] args)
        {
            B obj=new B();
            obj.show();
        }
}
class A
{
    public void show()
    {
        System.out.println("A class");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("B class");
    }
}
