
/*
Read three values (variables A, B and C), which are the three student's grades. 
Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5.
 Consider that each grade can go from 0 to 10.0, always with one decimal place.
*/

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		double num1, num2, num3, media;
		s=input.readLine();
		num1=Double.parseDouble(s);
		s=input.readLine();
		num2=Double.parseDouble(s);
		s=input.readLine();
		num3=Double.parseDouble(s);
		media=(2*num1+3*num2+5*num3)/(10);
		System.out.printf("MEDIA = %.1f\n",media);
	}
}