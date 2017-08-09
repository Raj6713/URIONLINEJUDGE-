
/*Sequence printer*/
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		int i,j;
		j=7;
		for(i=1;i<=9;i=i+2)
		{
           System.out.printf("I=%d J=%d\n",i,j--);
           System.out.printf("I=%d J=%d\n",i,j--);
           System.out.printf("I=%d J=%d\n",i,j);
           j=j+4;
		}

	}
}