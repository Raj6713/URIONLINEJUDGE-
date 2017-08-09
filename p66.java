/*Write a program that read two numbers X and Y and print the result of dividing the X by Y. 
If it's not possible, print the message "divisão impossível".
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x,y,testcases;
		String s=null;
		testcases=Integer.parseInt(in.readLine());
		for(int i=0;i<testcases;i++)
		{
			s=in.readLine();
			x=Integer.parseInt(s.split(" ")[0]);
			y=Integer.parseInt(s.split(" ")[1]);
			if(y==0)
				System.out.printf("divisao impossivel\n");
			else 
				System.out.printf("%.1f\n",(double)x/y);
		}

	}
}