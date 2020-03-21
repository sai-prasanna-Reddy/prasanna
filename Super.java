public class Super {
    public static void main(String[] args)
        {
            B obj2=new B(5);
        }
}
class A extends Object
{
    public A()
    {
        System.out.println("A");
    }
        public A(int i)
        {
            super();
        System.out.println("A parameter");          
        }
}
class B extends A
{
    public B()
    {
        System.out.println("B");
    }  
    public B(int i)
    {
        super(i);
    System.out.println("B parameter");          
    }
}