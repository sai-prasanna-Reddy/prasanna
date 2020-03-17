class Armstrong
{
  public static void main(String args[])
  {
   int n=153;
   int temp=n,sum=0,r;
   while(n>0)
   {
     r=n%10;
     n=n/10;
     sum=sum+(r*r*r);
    }
    if(temp==sum)
      System.out.println(temp  + "is a Armstrong number");
    else
      System.out.println(temp  + "is not a Armstrong number");
   }
}