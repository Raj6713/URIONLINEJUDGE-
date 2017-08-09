
/*Write a program that reads two integer numbers 
X and Y. Print all numbers between X and Y which dividing it by 5 the rest is equal to 2 or equal to 3.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BUfferedReader(new InputStreamReader(System.in));
		int x,y,start,end;
		x=Integer.parseInt(in.readLine());
		y=Integer.parseInt(in.readLine());
		if(x>y)
			{start=y;end=x;}
		else 
		    {start=x;end=y;}
		for(int i=start;i<=end;i++)
		{
			if(i%5==2 || i%5==3)
				System.out.printf("%d\n",i);
		}
	}
}