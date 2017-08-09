
/*Read an integer N. Print the square of each one of the even values from 1 to N including N if it is the case.*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num;
		num=Integer.parseInt(input.readLine());
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				System.out.printf("%d%%d = %d",num,num,num*num);
		}
	}
}