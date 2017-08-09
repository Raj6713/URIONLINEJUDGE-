/*
Read an undetermined number of pairs values M and N (stop when any of these values is less or equal to zero).
 For each pair, print the sequence from the smallest to the biggest (including both) and the sum of consecutive
  integers between them (including both)
*/
import java.io.Bufferedeader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int m,n,sum,i;
		String s=null;
		for(;;)
		{

          s=input.readLine();
          m=Integer.parseInt(s.split(" ")[0]);
          n=Integer.parseInt(s.split(" ")[1]);
          if(m==0 || n=0)
          	break;
          sum=0;
          if(m>n)
          {
             for(i=n;i<=m;i++)
             	{System.out.printf("%d ",i);sum+=i;}
          }
          else
          {
          	for(i=m;i<=n;i++)
             	{System.out.printf("%d ",i);sum+=i;}

          }
          System.out.printf("%d\n",sum);

		}
	}
}