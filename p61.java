/*Read an integer N that is the number of test cases.
 Each test case is a line containing two integer numbers X and Y. Print the sum of all odd values between them, not including X and Y.*/
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 public class Main 
 {
 	public static void main(String[] args) throws IOException 
 	{
 		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
 		int testcases,x,y,j,sum=0;
 		String s=null;
 		testcases=Integer.parseInt(input.readLine());
 		for(int i=0;i<testcases;i++)
 		{
          s=input.readLine();
          x=Integer.parseInt(s.split(" ")[0]);
          y=Integer.parseInt(s.split(" ")[1]);
          if(x>y)
          {
             for(j=y+1;j<x;j++)
             	if(j%2!=0)sum+=j;
          }
          else
          {
               for(j=x+1;j<y;j++)
             	if(j%2!=0)sum+=j;
          }
          System.out.printf("%d\n",sum);
 		}
 	}
 }