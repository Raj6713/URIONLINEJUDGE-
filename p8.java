/*
Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour. 
Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.
Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.
Don’t forget the space before and after the equal signal and after the U$.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
		String s=null;
		int empNum,empHours;
		double hourRate,earning;
		s=input.readLine();
		empNum=Integer.parseInt(s);
		s=input.readLine();
		empHours=Integer.parseInt(s);
		s=input.readLine();
		hourRate=Double.parseDouble(s);
        earning=hourRate*empHours;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",empNum,earning);
	}
}