
/*Logical sequences*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int lines=Integer.parseInt(in.readLine());
		for(int i=1;i<=lines;i++)
		{
			System.out.printf("%d %d %d\n",i,i*i,i*i*i);
			System.out.printf("%d %d %d\n",i,i*i+1,i*i*i+2);
		}
	}
}