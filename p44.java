
/*Write a program which will find the posotive numbers and also find the positive average*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		double num,sum=0.0;
		int count=0;
		for(int i=0;i<6;i++)
		{
			num=Double.parseDouble(input.readLine());
			if(num>0)
			{
				count++;
				sum+=num;
			}
		}
		if(count!=0)
		{
			System.out.printf("%d valores positivos\n%.1f\n",count,sum/count);
		}
	}
}