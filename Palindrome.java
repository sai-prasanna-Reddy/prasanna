class Palindrome
{
 public static void main(String args[])
 {
  int r,sum=0,n=325;
  int temp=n;
  while(n>0)
  {
    r=n%10;
    n=n/10;
    sum=sum*10+r;
    }
  if(temp==sum)
    System.out.println(temp + "is a palindrome number:");
  else
    System.out.println(temp + "is not a palindrome number:");
   }
}

  