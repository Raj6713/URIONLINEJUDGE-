
/*
Make a program that calculates
 and shows the volume of a sphere being provided the value of its radius (R) . The formula to calculate the volume is: (4/3) * pi * R3.
  Consider (assign) for pi the value 3.14159.
Tip: Use (4/3.0) or (4.0/3) in your formula, because some languages (including C++)
 assume that the division's result between two integers is another integer. :)
*/

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.lang.Math;
 
 public class Main 
 {
 	public static void main(String[] args) throws IOException
 	{
 		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
 		String s=null;
 		double pi=3.14159,radius,volume;
 		s=input.readLine();
 		radius=Double.parseDouble(s);
 		volume=(4.0/3)*pi*Math.pow(radius,3);
 		System.out.printf("VOLUME = %.3f\n",volume);
 	}
 }