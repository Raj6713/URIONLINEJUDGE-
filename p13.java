
/*
Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior". Use the following formula:
*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.Math;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader  input = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		int a,b,c,firstHigh, finalHigh;
		s=input.readLine();
		a=Integer.parseInt(s.split(" ")[0]);
		b=Integer.parseInt(s.split(" ")[1]);
		c=Integer.parseInt(s.split(" ")[2]);
		firstHigh=(a+b+Math.abs(a-b))/2;
		finalHigh=(firstHigh+c+Math.abs(firstHigh-c))/2;
		System.out.printf("%d eh o maior\n",finalHigh);
	}
}