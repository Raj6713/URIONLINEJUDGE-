
/*Sequence printer*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int i,j;
		i=1;j=60;
		for(;;)
		{
           while(j>=0)
           System.out.printf("I=%d J=%d\n",i=i+3,j=j-5);
		}
	}
}