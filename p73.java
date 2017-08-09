
/*Write a program that reads an integer N (1 < N < 1000). This N is the number of output lines printed by this program.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int lines,i;
		lines=Integer.parseInt(in.readLine());
		for(int i=1;i<=lines;i++)
			System.out.printf("%d %d %d\n",i,i*i,i*i*i);
	}
}