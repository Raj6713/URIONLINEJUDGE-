/*Read an integer N (2 < N < 1000). Print the multiplication table of N.
1 x N = N      2 x N = 2N        ...       10 x N = 10N  */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(input.readLine())
		for(i=1;i<=10;i++)
			System.out.printf("%d * num = %d\n",i,num,num*i);
	}
}