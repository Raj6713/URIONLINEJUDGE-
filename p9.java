/*
Make a program that reads a seller's name, his/her fixed salary and the sale's total made 
by himself/herself in the month (in money). Considering that this seller receives 15% over all products sold,
 write the final salary (total) of this seller at the end of the month , with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String name,s=null;
		s=input.readLine();
		name=s;
		s=input.readLine();
		double fixed=Double.parseDouble(s);
		s=input.readLine();
		double sales=Double.parseDouble(s);
		double total=fixed+0.15*sales;
		System.out.printf("TOTAL = R$ %.2f\n",total);

	}
}