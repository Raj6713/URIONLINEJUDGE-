
/*Sequence printer*/
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		int i,j;
		for(i=1;i<=9;i++)
		{    j=7
			System.out.printf("I=%d J=%d\n",i,j--);
			System.out.printf("I=%d J=%d\n",i,j--);
			System.out.printf("I=%d J=%d\n",i,j--);
		}
	}
}