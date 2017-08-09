/*Read 100 integer numbers. Print the highest read value and the input position.*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num,max,position;
		max=Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
		{
			num=Integer.parseInt(input.readLine());
			if(num>max)
			{
				max=num;
				position=i+1;
			}
		}
		System.out.printf("%d\n%d\n",max,position);
	}
}