
/*Write a program which will add two numbers and will show output of them*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p1 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		int sum, num1, num2;
		s=input.readLine();
		num1=Integer.parseInt(s);
		s=input.readLine()
		num2=Integer.parseInt(s);
		sum=num1+num2;
		System.out.printf("X = %d\n",sum);
	}
}