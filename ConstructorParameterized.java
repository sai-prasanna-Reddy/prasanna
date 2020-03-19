class ConstructorParameterized
{
  public static void main(String args[])
  {
    Abc obj=new Abc(6);
    }
}
class Abc
{
  public Abc()
  {
    System.out.println("hi this is default constructor");
   }

  public Abc(int i)
  {
    System.out.println("hi this is parameterized constructor");
   }
}