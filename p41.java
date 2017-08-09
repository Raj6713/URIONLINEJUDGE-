
/*Program to print ll even number from 1 to 100*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		for(int i=1;i<=100;i++)
			if(i%2==0)
				System.out.printf("%d\n",i);
	}
}