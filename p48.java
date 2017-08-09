/*Read an integer value X and print the 6 consecutive odd numbers from X, a value per line, including X if it is the case.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int num,count=0;
		num=Integer.parseInt(input.readLine());
        for(int i=num; ;num++)
        {
        	if(i%2!=0)
        	{
        		System.out.printf("%d\n",i);
        		count++;
        	}
        	if(count==6)
        		break;
        }
	}
}