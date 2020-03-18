class ArrayTwodimension
{
  public static void main(String args[])
  {
     int x[]={5,6,7,8};
     int y[]={2,3,4,0};
     int z[]={1,2,3,4};
     int p[][]={ {5,6,7,8},
                 {2,3,4,0},
                 {1,2,3,4}};
     for(int i[] : p)
     {
       for(int j : i)
       {
         System.out.print(j + " ");
        }
      System.out.println(" ");
     }
   }
}