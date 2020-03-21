public class Overloading {
    public static void main(String[] args)
        {
            A obj=new A(5);
        }  
}
class A
{
    public A()
    {
        System.out.println("constructor");
    }
    public A(int i)
    {
        System.out.println("constructor int");
    }
    public A(double d)
    {
        System.out.println("constructor intDouble");
    }
}