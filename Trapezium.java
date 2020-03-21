public class Trapezium
{
	public static void main(String[] args) {
	       int i,j,k=1,k1=17,tmp;
	       for(i=4;i>=1;i--,k1-=i)
	       {
	           for(j=i;j<4;j++)
	           {
	               System.out.print("---");
	           }
	           for(j=i;j>=1;j--)
	           {
	               System.out.printf(k++ + "*");
	           }
	           for(j=i,tmp=k1;j>=1;j--,tmp++)
	           {
	               System.out.print(tmp);
	               if(j!=1)
	               System.out.print("*");
	           }
	           System.out.println("");
	       }
	}
}