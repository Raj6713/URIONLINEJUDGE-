/*
Read an undetermined number of pairs of integer values. Write a message for each pair indicating if this two 
numbers are in ascending or descending order.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num1,num2;
		String s=null;
		for(;;)
		{
			s=input.readLine();
			num1=Integer.parseInt(s.split(" ")[0]);
			num2=Integer.parseInt(s.split(" ")[1]);
			if(num1==num2)
				break;
			if(num1>num2)
				System.out.printf("Decrescente\n");
			else
				System.out.printf("Crescente\n");

		}
	}
}