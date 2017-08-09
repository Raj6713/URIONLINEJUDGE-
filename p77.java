
/*Write an algorithm to read a value A and a value N. Print the sum of N numbers from A (inclusive). While N 
is negative or ZERO, a new N (only N) must be read. All input values are in the same line.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int a,n;
		boolean choice=true;
		String s=null;
		s=in.readLine();
		a=Integer.parseInt(s.split(" ")[0]);
		n=Integer.parseInt(s.split(" ")[1]);
		if(n<=0)
		{
			while(choice)
			{
				n=Integer.parseInt(s.split(" ")[1]);
				if(n>0)
					choice=false;
				else 
					choice=true;

			}
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
          sum+=a++;
		}
		System.out.printf("%d\n",sum);
	}
}