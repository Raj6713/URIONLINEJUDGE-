
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int number;
		number=Integer.parseInt(input.readLine());
		for(int i=1;i<=number;i++)
		{
			if(i%2!=0)
				System.out.printf("%d\n",i);
		}
	}
}