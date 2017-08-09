/*Read an integer N, which represents the number of following test cases. 
Each test case consists of three floating-point numbers, each one with one digit after the decimal point.
 Print the weighted average for each of these sets of three numbers, considering that the first number has weight 2, 
the second number has weight 3 and the third number has weight 5.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		double num1,num2,num3,wAvg=0;
		int testcases=Integer.parseInt(input.readLine());
		for(int i=0;i<testcases;i++)
		{
          s=input.readLine();
          num1=Double.parseDouble(s.split(" ")[0]);
          num2=Double.parseDouble(s.split(" ")[1]);
          num3=Double.parseDouble(s.split(" ")[2]);
          wAvg=(num1*2+num2*3+num3*5)/10.0;
          System.out.printf("%.1f\n",wAvg);
		}
	}
}