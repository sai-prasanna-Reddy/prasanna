class Varargs
{
  public static void main(String args[])
  {
     Display obj=new Display();
     obj.show(5,4,7,8,9,0);
   }
}
class Display
{
  void show(int ...a)
  {
    for(int i : a)
    {
      System.out.println(i);
     }
   }
}
