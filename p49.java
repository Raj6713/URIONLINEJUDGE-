
/*Write a program which will take two numbers nd will show the sum betweeen two numbers*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		Bufferedreader input=new BufferedReader(new InputStreamReader(System.in));
	    int num1,num2,start,end,sum=0;
	    num1=Integer.parseInt(input.readLine());
	    num2=Integer.parseInt(input.readLine());
	    if(num1>num2)
	    	{start=num2;end=num1;
	    else 
	    	{start=num1;end=num2;}
	    for(int i=start;i<=end;i++)
	    {
	    	if(i%2!=0)
	    		sum=sum+i;
	    }
	    System.out.printf("%d\n",sum);
	}
}