class Ternary
{ 
  public static void main(String args[])
  {
    int obj1;
    double obj2;
    if(true)
    {
      obj1=new Integer(10);
     }
     else
     {
      obj1=new Double(15.0);
      }
      System.out.println(obj1);
      obj2=true?new Integer(10):new Double(15.0);
      System.out.println(obj2);
     }
}