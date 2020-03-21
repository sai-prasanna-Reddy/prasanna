public class Const {
    public static void main(String[] args)
        {
            A obj=new A(4,3.5);
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
        System.out.println("constructor parameter");
    }
    public A(int i,double d)
    {
        System.out.println("constructor int Double");
    }
}