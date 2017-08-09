
/*Write a program that reads an integer N. This N is the number of output lines printed by this program.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int lines,count=0;
		lines=Integer.parseInt(in.readLine());
		for(int i=0;i<lines;i++)
		{
			System.out.printf("%d %d %d PUM\n",count++,count++,count++);
		}
	}
}