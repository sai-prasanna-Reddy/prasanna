class ThreeDimension
{
  public static void main(String args[])
  {
    int a[]=new int[5];
    int b[][]=new int[4][4];
    int c[][][]=new int[4][4][4];
    for(int i=0;i<4;i++)
    {
     for(int j=0;j<4;j++)
     {
      for(int k=0;k<4;k++)
      {
        c[i][j][k]=i+j+k;
       }
     }
   }
   for(int i[][] : c)
   {
     for(int j[] : i)
     {
       for(int k : j)
       {
         System.out.println(" " + k);
        }
     }
    }
  }
}