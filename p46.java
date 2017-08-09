/*Write a program which will print even, odd, positive and negative numbers*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int even,odd,positive,negative,num;
		even=odd=positive=negative=0;
		for(int i=0;i<5;i++)
		{
			num=Integer.parseInt(input.readLine());
			if(num%2==0)
				even++;
			else
				odd++;
			if(num>0)
				positive++;
			else if(num<0)
				negative++;
		}
		System.out.printf("%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",even,odd,positive,negative);
	}
}