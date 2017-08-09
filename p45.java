
/*Write a program which will find even number in five positive numbers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num,count=0;
		for(int i=0;i<6;i++)
		{
			num=Integer.parseInt(input.readLine());
			if(num%2==0)
				count++;
		}
		System.out.printf("%d valores pares\n",count);
	}
}