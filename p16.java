
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		int num;
		num=Integer.parseInt(input.readLine());
		System.out.printf("%d minutos\n",2*num);
	}
}