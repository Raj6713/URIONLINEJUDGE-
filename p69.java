/*Write a program that reads two integer numbers X and Y and calculate the sum of all number
 not divisible by 13 between them, including both.*/
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 public class Main 
 {
 	public static void main(String[] args) throws IOException 
 	{
 		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 		int sum=0;
 		int x,y,start,end;
 		x=Integer.parseInt(in.readLine());
 		y=Integer.parseInt(in.readLine());
 		if(x>y)
 		{start=y;end=x;}
 	     else
 	    {start=x;end=y;}
 	    for(int i=start;i<=end;i++)
 	    {
 	    	if(i%13!=0)
 	    		sum+=i;
 	    }
 	    System.out.printf("%d\n",sum);
 	}
 }