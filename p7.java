

/*
Read four integer values named A, B, C and D. 
Calculate and print the difference of product A and B by the product of C and D (A * B - C * D).
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		int num1, num2, num3, num4, byprod;
		s=input.readLine();
		num1=Integer.parseInt(s);
		s=input.readLine();
		num2=Integer.parseInt(s);
		s=input.readLine();
		num3=Integer.parseInt(s);
		s=input.readLine();
		num4=Integer.parseInt(s);
		byprod=(num1*num2-num3*num4);
		System.out.printf("DIFERENCA = %d\n",byprod);
	}
}