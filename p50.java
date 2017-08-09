
/*Read an integer N. This N will be the number of integer numbers X that will be read.

Print how many these numbers X are in the interval [10,20] and how many values are out of this interval.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		int lowerLimit,upperLimit,countIn,countOut,num,count;
		lowerLimit=10;
		upperLimit=20;
		countIn=countOut=0;
		count=Integer.parseInt(input.readLine());
		for(int i=0;i<count;i++)
		{
			num=Integer.parseInt(input.readLine());
			if(num>=lowerLimit &&num<=upperLimit)
				countIn++;
			else 
				countOut++;
		}
		System.out.printf("%d in\n%d out\n",countIn,countOut);
	}
}