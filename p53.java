
/*Read an integer N. Print all numbers between 1 and 10000, which divided by N will give the rest = 2.*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int number;
		number=Integer.parseInt(input.readLine());
		for(int i=2;i<10000;i++)
		{
			if(i%number==2)
				System.out.printf("%d\n",i);
		}
	}
}